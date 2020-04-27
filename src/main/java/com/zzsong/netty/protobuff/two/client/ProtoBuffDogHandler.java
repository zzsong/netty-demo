package com.zzsong.netty.protobuff.two.client;

import com.zzsong.netty.protobuff.two.ProtoData;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ProtoBuffDogHandler extends SimpleChannelInboundHandler<ProtoData.MyDataInfo> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ProtoData.MyDataInfo msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ProtoData.Dog dog = ProtoData.Dog.newBuilder()
                .setName("中华田园")
                .setType(1)
                .build();
        ProtoData.MyDataInfo dogInfo = ProtoData.MyDataInfo.newBuilder()
                .setDataType(ProtoData.MyDataInfo.DataType.DogType)
                .setDog(dog)
                .build();
        ctx.channel().writeAndFlush(dogInfo);
        System.out.println("=======>>>>>>>>>>>>>>>>>");

    }
}
