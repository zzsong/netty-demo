package com.zzsong.netty.protobuff.two.client;

import com.zzsong.netty.protobuff.two.ProtoData;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ProtoBuffCarHandler extends SimpleChannelInboundHandler<ProtoData.MyDataInfo> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ProtoData.MyDataInfo msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        ProtoData.Dog dog = ProtoData.Dog.newBuilder()
//                .setName("中华田园")
//                .setType(1)
//                .build();
//        ProtoData.MyDataInfo dogInfo = ProtoData.MyDataInfo.newBuilder()
//                .setDataType(ProtoData.MyDataInfo.DataType.DogType)
//                .setDog(dog)
//                .build();
//        ctx.channel().writeAndFlush(dogInfo);
//        System.out.println("=======>>>>>>>>>>>>>>>>>");

        ProtoData.Car car = ProtoData.Car.newBuilder()
                .setNumber("GD01234")
                .build();
        ProtoData.MyDataInfo carInfo = ProtoData.MyDataInfo.newBuilder()
                .setDataType(ProtoData.MyDataInfo.DataType.CarType)
                .setCar(car)
                .build();
        ctx.channel().writeAndFlush(carInfo);
        System.out.println("=======>>>>>>>>>>>>>>>>>");
//
//        ProtoData.Person person = ProtoData.Person.newBuilder()
//                .setId(100)
//                .setName("张三")
//                .setNormal(true)
//                .setGender(ProtoData.Person.Gender.FEMALE)
//                .build();
//        ProtoData.MyDataInfo personInfo = ProtoData.MyDataInfo.newBuilder()
//                .setDataType(ProtoData.MyDataInfo.DataType.PersonType)
//                .setPerson(person)
//                .build();
//        ctx.channel().writeAndFlush(personInfo);
    }
}
