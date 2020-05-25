package com.zzsong.netty.nio.talk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NioClient {

    public static void main(String[] args) {

        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);

            Selector selector = Selector.open();
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
            socketChannel.connect(new InetSocketAddress("localhost",8989));

            while (true){
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();

                for (SelectionKey selectionKey : selectionKeys){
                    if (selectionKey.isConnectable()){//与服务端建立好连接
                        SocketChannel client = (SocketChannel) selectionKey.channel();

                        if (client.isConnectionPending()){//是否处在连接挂起
                            client.finishConnect();

                            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
                            writeBuffer.put(String.format("%s：连接成功",LocalDateTime.now()).getBytes());

                            writeBuffer.flip();
                            client.write(writeBuffer);

                            ExecutorService executorService = Executors.newSingleThreadExecutor(Executors.defaultThreadFactory());
                            executorService.execute(()->{
                                while (true){
                                    try {
                                        writeBuffer.clear();
                                        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                                        BufferedReader reader = new BufferedReader(inputStreamReader);

                                        String sendMessage = reader.readLine();

                                        writeBuffer.put(sendMessage.getBytes());
                                        writeBuffer.flip();
                                        client.write(writeBuffer);
                                    }catch (Exception e){
                                        e.printStackTrace();
                                    }
                                }
                            });

                            client.register(selector,SelectionKey.OP_READ);
                        }

                    }else if (selectionKey.isReadable()){
                        SocketChannel client = (SocketChannel) selectionKey.channel();

                        ByteBuffer readerBuffer = ByteBuffer.allocate(1024);
                        int count = client.read(readerBuffer);
                        if (count > 0){
                            String message = new String(readerBuffer.array(),0,count);
                            System.out.println(message);
                        }
                    }
                }

                //
                selectionKeys.clear();
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

