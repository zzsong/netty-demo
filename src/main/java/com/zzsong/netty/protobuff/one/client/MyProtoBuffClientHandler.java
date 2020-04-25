package com.zzsong.netty.protobuff.one.client;

import com.zzsong.netty.protobuff.one.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class MyProtoBuffClientHandler extends SimpleChannelInboundHandler<DataInfo.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Student msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setId(10).setName("张三").setEmail("zansan@126.com").build();
        ctx.channel().writeAndFlush(student);
    }
}
