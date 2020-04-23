package com.zzsong.netty.websocket.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.util.CharsetUtil;

public class MyWebSocketInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast(new HttpServerCodec());
        pipeline.addLast(new StringDecoder(CharsetUtil.UTF_8));
        pipeline.addLast(new StringEncoder(CharsetUtil.UTF_8));
        //以块的方式来写的处理器
        pipeline.addLast(new ChunkedWriteHandler());
        //netty对于请求采取的是分块或分段的方式，客户端向服务器发送请求，假如长度=1000
        // ，netty会分成N个段，每一段都会走下完整的流程。因此每个read0()方法都只是读取到一段数据。
        //聚合到一起得到一个完整的http请求/响应。
        pipeline.addLast(new HttpObjectAggregator(8192));

        //ws://server:port/context_path
        //ws://localhost:8080/ws
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));

        pipeline.addLast(new TextWebSocketFrameHandler());

    }
}
