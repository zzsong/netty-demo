package com.zzsong.netty.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest8Direct {

    public static void main(String[] args) throws  Exception{
        FileInputStream inputStream = new FileInputStream("txt/input.txt");
        FileOutputStream outputStream = new FileOutputStream("txt/output.txt");

        FileChannel inputChannel = inputStream.getChannel();
        FileChannel outputChannel = outputStream.getChannel();

        /**
         *
         */
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        while (true){
            buffer.clear();

            int read = inputChannel.read(buffer);

            if (-1 == read){
                break;
            }

            buffer.flip();

            outputChannel.write(buffer);
        }

        inputChannel.close();
        outputChannel.close();
    }
}
