package com.zzsong.netty.nio.talk;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class NioServer {

    private static Map<String, SocketChannel> clientMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws Exception {
        //服务器端只有一个线程
        //服务器端需要保存客户端：连接，标识（mac）


        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(8989));

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        /*
        读：把数据放置于Buffer中
        写：从Buffer拿到外面
         */

        //网络程序中的主线程永远是个死循环，不会退出
        while (true){
            try{
                //一直阻塞，等待监听SelectionKey事件，直到有响应才返回所关注事件的数量
                int number = selector.select();
                //获取返回的所关注的事件SelectionKey集合
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                //最开始只是建立连接，事件只有一个。当建立连接后，添加其它操作事件
                selectionKeys.forEach(selectionKey -> {

                    final SocketChannel client;

                    try {
                        //判断SelectionKey类型
                        if (selectionKey.isAcceptable()){
                            //通过SelectionKey.channel()获取到当前事件发生在哪个channel上，
                            ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
                            //原有的socketChannel使用不上，需要注册新的socketChannel事件对象,并注册到selector上,添加新的关注事件。
                            client = server.accept();
                            client.configureBlocking(false);
                            client.register(selector, SelectionKey.OP_READ);
                            /*
                            在Selector中注册二个Channel：serverSocketChannel，SocketChannel。
                            ServerSocketChannel：关注是连接的事件
                            SocketChannel： 关注数据的读取事件
                             */
                            //纪录客户注册
                            String key = String.format("[%s]",UUID.randomUUID().toString());
                            clientMap.put(key, client);
                        } else if (selectionKey.isReadable()){//判断是否有数据
                            //只有socketChannel注册了read事件，类型转换需要注意。
                            client = (SocketChannel)selectionKey.channel();
                            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                            int count = client.read(readBuffer);
                            if (count > 0 ){
                                //读取客户端数据，进行写数据
                                readBuffer.flip();

                                Charset charset = Charset.forName("utf-8");
                                String receiveMessage = String.valueOf(charset.decode(readBuffer).array());
                                System.out.println(client + " : " + receiveMessage);

                                String readerKey = "";
                                for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()){
                                    if (client == entry.getValue()){
                                        readerKey = entry.getKey();
                                        break;
                                    }
                                }

                                //向所有连接客户端发送消息
                                for (Map.Entry<String, SocketChannel> entry : clientMap.entrySet()){
                                    SocketChannel value = entry.getValue();
                                    ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
                                    writeBuffer.put(String.format("%s:%s",readerKey,receiveMessage).getBytes());
                                    writeBuffer.flip();
                                    value.write(writeBuffer);
                                }
                            }


                        }


                    } catch (Exception e){
                        e.printStackTrace();
                    }

                });


                //使用完selectKey之后一定要删除掉
                //如果不清除，下次循环还是会进行处理，会报空指针异常
                selectionKeys.clear();
            } catch (Exception e){
                e.printStackTrace();
            }

        }


    }
}
