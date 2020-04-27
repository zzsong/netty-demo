package com.zzsong.netty.protobuff.two.client;

import com.zzsong.netty.protobuff.two.ProtoData;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ProtoBuffPersonHandler extends SimpleChannelInboundHandler<ProtoData.MyDataInfo> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ProtoData.MyDataInfo msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        ProtoData.Person person = ProtoData.Person.newBuilder()
                .setId(100)
                .setName("张三")
                .setNormal(true)
                .setGender(ProtoData.Person.Gender.FEMALE)
                .build();
        ProtoData.MyDataInfo personInfo = ProtoData.MyDataInfo.newBuilder()
                .setDataType(ProtoData.MyDataInfo.DataType.PersonType)
                .setPerson(person)
                .build();
        ctx.channel().writeAndFlush(personInfo);
        System.out.println("=======>>>>>>>>>>>>>>>>>");
    }
}
