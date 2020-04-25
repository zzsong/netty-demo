package com.zzsong.netty.protobuff.two.server;

import com.zzsong.netty.protobuff.two.ProtoData;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TwoProtoBuffServerHandler extends SimpleChannelInboundHandler<ProtoData.MyDataInfo> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ProtoData.MyDataInfo msg) throws Exception {

        ProtoData.MyDataInfo.DataType dataType = msg.getDataType();
        switch (dataType){
            case DogType:
                System.out.println("=========Dog>>>>>>>>>>>>>>>>>");
                ProtoData.Dog dog = msg.getDog();
                System.out.println(dog.getType()+" \t "+dog.getName());
                break;
            case CarType:
                System.out.println("=========Car>>>>>>>>>>>>>>>>>");
                ProtoData.Car car = msg.getCar();
                System.out.println(car.getNumber());
                break;
            case PersonType:
                System.out.println("=========Person>>>>>>>>>>>>>>>>>");
                ProtoData.Person person = msg.getPerson();
                System.out.println(person.getName());
                System.out.println(person);
                break;
            case UNRECOGNIZED:
                System.out.println("=========UNRECOGNIZED>>>>>>>>>>>>>>>>>");

                break;
        }
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
    }
}
