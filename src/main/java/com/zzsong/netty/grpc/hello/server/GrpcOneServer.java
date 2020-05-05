package com.zzsong.netty.grpc.hello.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcOneServer {

    private Server server;

    private void start() throws IOException {
        this.server = ServerBuilder
                .forPort(8989)
                .addService(new GreaterServerImpl())
                .build().start();

        System.out.println("  ====service starter ======");

    }

    private void stop(){
        if (null != this.server){
            this.server.shutdown();
        }
    }

    private void awaitTermination() throws InterruptedException {
        if (null != this.server){
            this.server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        GrpcOneServer server = new GrpcOneServer();

        server.start();

        //让服务器进入阻塞等待
        server.awaitTermination();
    }
}
