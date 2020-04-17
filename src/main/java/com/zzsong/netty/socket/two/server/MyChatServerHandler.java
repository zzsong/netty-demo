package com.zzsong.netty.socket.two.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class MyChatServerHandler extends SimpleChannelInboundHandler<String> {

    //
    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        Channel channel = ctx.channel();

        channelGroup.forEach(c ->{
            if (channel != c){
                c.writeAndFlush(channel.remoteAddress()+"发送消息:"+msg+"\n");
            } else {
                c.writeAndFlush("[自己]"+ msg+"\n");
            }
        });
    }

    //连接建立
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        //向通道连接，其它连接的客户端，发送该连接上线消息。
        //服务端需要把客户端的channel保存所有建立连接对象。
        //广播
        channelGroup.writeAndFlush("[服务器] - "+channel.remoteAddress()+" 加入\n");
        channelGroup.add(channel);
    }

    //连接断掉
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        //netty 自动会将断掉的channel移除
        channelGroup.writeAndFlush("[服务器] - "+channel.remoteAddress()+" 离开\n");
    }

    //连接处于活跃状态
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress()+"  上线");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println(channel.remoteAddress()+"  下线");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
