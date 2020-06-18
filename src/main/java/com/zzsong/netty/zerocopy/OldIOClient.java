package com.zzsong.netty.zerocopy;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.time.LocalDateTime;

public class OldIOClient {

    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",8989);

        String fileName = "F:\\del\\demo\\ubuntu18.iso";
        InputStream inputStream = new FileInputStream(fileName);

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        byte[] buffer = new byte[4096];
        long readCount = 0;
        long total = 0;

        long begin = System.currentTimeMillis();
        while ((readCount = inputStream.read(buffer))>0){
            total += readCount;
            dataOutputStream.write(buffer);
        }

        System.out.println("发送总字节数据："+total+",耗时："+(System.currentTimeMillis() - begin));;

        dataOutputStream.close();
        socket.close();
        inputStream.close();
    }
}
