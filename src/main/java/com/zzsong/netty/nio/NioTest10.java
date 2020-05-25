package com.zzsong.netty.nio;

import io.grpc.internal.JsonUtil;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

public class NioTest10 {

    /***
     *
     * Buffer的Scattering , Gathering
     *
     *
     *
     */
    public static void main(String[] args) throws Exception {

        /**
         *
         * Scattering：
         * 表示分散、散開。
         * 不仅能传递一个Buffer，还能够传递一个Buffer数组。
         * 比如：从一个Channel读到多个Buffer当中，按照顺序来读满，第一个Buffer读满后然后读第二个，以此类推。
         *
         * 数据分门别类
         *
         *
         * Gathering：
         *聚合，匯成一個
         *
         */
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress(8989);
        serverSocketChannel.socket().bind(address);

        int messageLength = 2 + 3 + 4;

        ByteBuffer[] buffers = new ByteBuffer[3];
        buffers[0] = ByteBuffer.allocate(2);
        buffers[1] = ByteBuffer.allocate(3);
        buffers[2] = ByteBuffer.allocate(4);

        SocketChannel socketChannel = serverSocketChannel.accept();

        while (true){
            int byteRead = 0;

            while (byteRead < messageLength){
                long r = socketChannel.read(buffers);
                byteRead += r;
            }

            System.out.println("byteRead : " + byteRead);

            Arrays.asList(buffers).stream()
                    .map(buffer->"position:"+buffer.position()+"; limit:"+buffer.limit())
                    .forEach(System.out::println);


            //
            Arrays.asList(buffers).forEach(buffer->buffer.flip());

            long byteWritten = 0;
            while (byteWritten < messageLength){
                long r = socketChannel.write(buffers);
                byteWritten += r;
            }
            //
            Arrays.asList(buffers).forEach(byteBuffer -> byteBuffer.clear());

            System.out.println(byteRead+"=="+byteWritten+"=="+messageLength);
        }


    }
}
