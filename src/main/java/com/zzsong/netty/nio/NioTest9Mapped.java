package com.zzsong.netty.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest9Mapped {

    public static void main(String[] args) throws Exception{
        RandomAccessFile randomAccessFile = new RandomAccessFile("txt/nioText9.txt","rw");
        FileChannel fileChannel = randomAccessFile.getChannel();

        MappedByteBuffer mappedByteBuffer =
                fileChannel.map(FileChannel.MapMode.READ_WRITE,1,3);

        /***
         * map -> 1,3.  表示文件index：1， 長度3個。
         *
         * map.put ->index .表示上面長度的位置，從0開始。
         *
         * 原數據： helloworld
         * map(1,3) => ell
         * put 0,1,2 => hyzxoworld
         */
        mappedByteBuffer.put(0, (byte) 'y');
        mappedByteBuffer.put(1, (byte) 'z');
        mappedByteBuffer.put(2, (byte) 'x');

        randomAccessFile.close();
    }
}
