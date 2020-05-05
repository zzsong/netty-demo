package com.zzsong.netty.grpc.hello.server;

import com.zzsong.netty.grpc.hello.GreeterGrpc;
import com.zzsong.netty.grpc.hello.HelloReply;
import com.zzsong.netty.grpc.hello.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreaterServerImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println("接收客户端消息： "+request.getName());

        responseObserver.onNext(HelloReply.newBuilder().setMessage("张三").build());

        responseObserver.onCompleted();

    }

    @Override
    public void sayHelloAgain(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

    }
}
