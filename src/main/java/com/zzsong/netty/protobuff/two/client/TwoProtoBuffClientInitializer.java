package com.zzsong.netty.protobuff.two.client;

import com.zzsong.netty.protobuff.two.ProtoData;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

public class TwoProtoBuffClientInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast(new ProtobufEncoder());
        pipeline.addLast(new ProtobufDecoder(ProtoData.MyDataInfo.getDefaultInstance()));
        pipeline.addLast(new ProtobufVarint32FrameDecoder());
        pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        pipeline.addLast(new ProtoBuffPersonHandler());
        pipeline.addLast(new ProtoBuffDogHandler());
        pipeline.addLast(new ProtoBuffCarHandler());
    }
}
