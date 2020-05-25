package com.zzsong.netty.nio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;

public class NioSelectorTest {

    public static void main(String[] args) throws Exception{

        //服务器监听5个端口
        int[] ports = new int[5];
        for (int i = 0; i < 5; i++) {
            ports[i] = 8000+i;
        }

        //构造方法
        Selector selector = Selector.open();
        //
        for (int i = 0; i < ports.length; i++) {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);

            ServerSocket socket = serverSocketChannel.socket();
            InetSocketAddress address = new InetSocketAddress(ports[i]);
            socket.bind(address);

            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("监听端口："+ports[i]);
        }

        while (true){
            int number = selector.select();
            System.out.println("number==>"+number);

            Set<SelectionKey> keySet = selector.selectedKeys();
            System.out.println("selectedKeys:"+keySet);

            Iterator<SelectionKey> iter = keySet.iterator();
            while (iter.hasNext()){
                SelectionKey key = iter.next();

                if (key.isAcceptable()){
                    ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                    SocketChannel socketChannel = channel.accept();
                    socketChannel.configureBlocking(false);

                    //真正连接的通道
                    socketChannel.register(selector, SelectionKey.OP_READ);

                    iter.remove();
                    System.out.println("获取客户端连接："+socketChannel);
                } else if (key.isReadable()){
                    //数据的读取
                    SocketChannel socketChannel = (SocketChannel) key.channel();

                    int byteRead = 0;
                    while (true){
                        ByteBuffer buffer = ByteBuffer.allocate(512);
                        buffer.clear();

                        int read = socketChannel.read(buffer);
                        if (read <= 0){
                            break;
                        }

                        buffer.flip();

                        socketChannel.write(buffer);
                        byteRead += read;
                    }

                    System.out.println("读取："+byteRead+",来源于："+socketChannel);
                    //使用完需要移除
                    iter.remove();
                }
            }

        }

    }
}
