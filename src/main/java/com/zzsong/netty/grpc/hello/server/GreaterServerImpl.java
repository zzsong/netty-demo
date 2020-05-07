package com.zzsong.netty.grpc.hello.server;

import com.zzsong.netty.grpc.hello.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class GreaterServerImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println("sayHello接收客户端消息： "+request.getName());

        //单对象请求与响应，如果添加多个onNext，会导致client接收异常。非零值结尾
        responseObserver.onNext(HelloReply.newBuilder().setMessage("张三").build());
//        responseObserver.onNext(HelloReply.newBuilder().setMessage("李四").build());

        responseObserver.onCompleted();

    }

    @Override
    public void getStudentFromName(StudentRequest request, StreamObserver<StudentReply> responseObserver) {
        System.out.println("getStudentFromName接收消息：" + request.getName());

        responseObserver.onNext(StudentReply.newBuilder().setName("张三").setAge(20).setCity("北京市").build());
        responseObserver.onNext(StudentReply.newBuilder().setName("李四").setAge(30).setCity("上海").build());
        responseObserver.onNext(StudentReply.newBuilder().setName("王五").setAge(40).setCity("深圳市").build());

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<PersonRequest> getPersonFromSexBiTalk(StreamObserver<PersonReply> responseObserver) {

        return new StreamObserver<PersonRequest>() {

            int sexCount = 0;
            List<Integer> sexList = new ArrayList<>();

            @Override
            public void onNext(PersonRequest value) {
                int sex = value.getSex();
                sexCount++;
                sexList.add(sex);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("getPersonFromSex出现在异常："+t.getMessage());
            }

            @Override
            public void onCompleted() {

                System.out.println("sexCount=="+sexCount);
                for (int i = 0; i < sexList.size(); i++) {
                    responseObserver.onNext(PersonReply.newBuilder().setName("张三"+i).setSex("性别："+sexList.get(i)).build());
                }
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<CatRequest> getCatFromCategory(StreamObserver<CatReply> responseObserver) {
        return new StreamObserver<CatRequest>() {

            List<String> categoryList = new ArrayList<>();

            @Override
            public void onNext(CatRequest value) {
//                categoryList.add(value.getCategory());
                System.out.println("onNext:> "+value.getCategory());
            }

            @Override
            public void onError(Throwable t) {
                //CANCELLED: cancelled before receiving half close
                //client客户端异步请求，需要阻塞主线程退出
                System.out.println("getCatFromCategory出现在异常："+t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("server completed ! ");

                responseObserver.onNext(CatReply.newBuilder()
                        .setAge(5).setCategory("种类数:"+categoryList.size()).setName("新猫")
                        .build());

                responseObserver.onCompleted();
            }
        };
    }
}
