package com.zzsong.netty.nio;

import java.nio.ByteBuffer;

public class NioTest5 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(64);
        buffer.put((byte) 'a');
        buffer.putInt(12);
        buffer.putDouble(0.56);
        buffer.putChar('a');
        buffer.putChar('中');

        buffer.flip();
        System.out.println(buffer.get());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getDouble());
        System.out.println(buffer.getChar());
        System.out.println(buffer.getChar());

    }
}
