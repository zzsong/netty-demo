package com.zzsong.netty.firstexample;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class FirstServer {

    /**
     * 服务端流程，基本分三步：
     *  1、编写服务器
     *  2、在服务器里面编写业务代码
     *  3、重写相应事件方法
     *
     */
    public static void main(String[] args) {
        System.out.println("--begin----->");
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try{
            /**
             * handler:  为了支持各种协议和处理数据的方式.
             *  用来处理各种事件，这里的事件很广泛，比如可以是连接、数据接收、异常、数据转换等。
             *  ChannelInboundHandler，一个最常用的Handler。这个Handler的作用就是处理接收到数据时的事件，
             *  也就是说，我们的业务逻辑一般就是写在这个Handler里面的，ChannelInboundHandler就是用来处理我们的核心业务逻辑。
             *
             *  ChannelInitializer，当一个链接建立时，我们需要知道怎么来接收或者发送数据，当然，
             *  我们有各种各样的Handler实现来处理它，那么ChannelInitializer便是用来配置这些Handler，它会提供一个ChannelPipeline，并把Handler加入到ChannelPipeline。
             *
             *  ChannelPipeline，一个Netty应用基于ChannelPipeline机制，这种机制需要依赖于EventLoop和EventLoopGroup，
             *  因为它们三个都和事件或者事件处理相关。
             *
             *  EventLoops的目的是为Channel处理IO操作，一个EventLoop可以为多个Channel服务。
             *
             *  Channel代表了一个Socket链接，或者其它和IO操作相关的组件，它和EventLoop一起用来参与IO处理。
             *
             *  Future，在Netty中所有的IO操作都是异步的，因此，你不能立刻得知消息是否被正确处理，
             *      但是我们可以过一会等它执行完成或者直接注册一个监听，具体的实现就是通过Future和ChannelFutures,
             *      他们可以注册一个监听，当操作执行成功或失败时监听会自动触发。
             *      总之，所有的操作都会返回一个ChannelFuture。
             */
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(bossGroup, workGroup).channel(NioServerSocketChannel.class)
                    .childHandler(new FirstServerInitializer());
            ChannelFuture channelFuture = bootstrap.bind(8899).sync();
            channelFuture.channel().closeFuture().sync();
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }

        System.out.println("-----end.");
    }
}
