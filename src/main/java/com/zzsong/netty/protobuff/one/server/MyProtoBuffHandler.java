package com.zzsong.netty.protobuff.one.server;

import com.zzsong.netty.protobuff.one.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class MyProtoBuffHandler extends SimpleChannelInboundHandler<DataInfo.Student> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Student msg) throws Exception {
        System.out.println(msg);
    }
}
