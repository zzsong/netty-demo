package com.zzsong.netty.zerocopy;

import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

public class NewIOClient {

    public static void main(String[] args) throws Exception{
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost",8989));
        socketChannel.configureBlocking(true);


        String fileName = "F:\\del\\demo\\ubuntu18.iso";

        FileChannel fileChannel = new FileInputStream(fileName).getChannel();

        long begin = System.currentTimeMillis();
        long transferCount = fileChannel.transferTo(0,fileChannel.size(), socketChannel);
        System.out.println("发送总字数："+transferCount+", 耗时:"+(System.currentTimeMillis()-begin));
    }
}
