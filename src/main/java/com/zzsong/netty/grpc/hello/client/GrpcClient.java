package com.zzsong.netty.grpc.hello.client;

import com.zzsong.netty.grpc.hello.*;
import com.zzsong.netty.protobuff.two.ProtoData;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel channel =  ManagedChannelBuilder
                .forAddress("localhost",8989)
                .usePlaintext().build();

        GreeterGrpc.GreeterBlockingStub blockingStub = GreeterGrpc.newBlockingStub(channel);

        HelloRequest request = HelloRequest.newBuilder().setName("name").build();
        HelloReply response = blockingStub.sayHello(request);
        System.out.println("接收: " + response.getMessage());

        System.out.println("----------------------");
        System.out.println("StudentReply消息：");
        StudentRequest studentRequest = StudentRequest.newBuilder().setName("zhanshan").build();
        Iterator<StudentReply> stuIterator = blockingStub.getStudentFromName(studentRequest);
        while (stuIterator.hasNext()){
            StudentReply reply = stuIterator.next();
            System.out.println(reply.getName()+","+reply.getAge()+","+reply.getCity());
        }
        System.out.println("----------------------");
        System.out.println("----------------------");

        //只要客户端以流式的形式向服务端发送数据，必须要使用异步请求
        //blockingStub：是同步阻塞式方法
        GreeterGrpc.GreeterStub greeterStub =  GreeterGrpc.newStub(channel);
        StreamObserver<CatReply> catReplyStreamObserver = new StreamObserver<CatReply>() {
            @Override
            public void onNext(CatReply value) {
                System.out.println(value.getAge()+", "+value.getCategory()+","+value.getName());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("run finish ! ");
            }
        };

        StreamObserver<CatRequest> catRequestStreamObserver = greeterStub.getCatFromCategory(catReplyStreamObserver);
        catRequestStreamObserver.onNext(CatRequest.newBuilder().setCategory("波斯猫").build());
        catRequestStreamObserver.onNext(CatRequest.newBuilder().setCategory("家猫").build());
        catRequestStreamObserver.onCompleted();

        System.out.println("--------双向流式--------------");


        StreamObserver<PersonReply> personReplyStreamObserver = new StreamObserver<PersonReply>() {
            @Override
            public void onNext(PersonReply value) {
                System.out.println("双向流client数据："+value.getName()+","+value.getSex());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("PersonReply双向流异常："+t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("双向流run finish ! ");
            }
        };


        StreamObserver<PersonRequest> personRequestStreamObserver =
                greeterStub.getPersonFromSexBiTalk(personReplyStreamObserver);
        personRequestStreamObserver.onNext(PersonRequest.newBuilder().setSex(1).build());
        personRequestStreamObserver.onNext(PersonRequest.newBuilder().setSex(2).build());
        personRequestStreamObserver.onNext(PersonRequest.newBuilder().setSex(3).build());
        personRequestStreamObserver.onCompleted();


        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
