package com.zzsong.netty.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest2 {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("txt/nioTest2.txt");
        FileChannel fileChannel = fileInputStream.getChannel();

        //512是底层数组的大小
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        fileChannel.read(byteBuffer);

        //定义反转
        byteBuffer.flip();

        while (byteBuffer.remaining() > 0){
            byte b = byteBuffer.get();
            System.out.println("character : "+ (char)b);
        }

        fileInputStream.close();
    }
}
