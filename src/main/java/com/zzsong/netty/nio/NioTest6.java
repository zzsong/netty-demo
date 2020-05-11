package com.zzsong.netty.nio;

import java.nio.ByteBuffer;

public class NioTest6 {
    public static void main(String[] args) {

        /**
         * Slice Buffer與原有Buffer，共享同一底層數組。
         * 對Slice Buffer的修改，會影響原有Buffer。
         */
        ByteBuffer buffer = ByteBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        buffer.position(3);
        buffer.limit(7);
        ByteBuffer sliceBuffer = buffer.slice();
        for (int i = 0; i < sliceBuffer.capacity(); i++) {
            byte b = sliceBuffer.get();
            b *= 2;
            sliceBuffer.put(i, b);
        }

        //需要重新設置位子
        buffer.position(0);
        buffer.limit(buffer.capacity());
        for (int i = 0; i < buffer.capacity(); i++) {
            System.out.println(buffer.get(i));
        }

    }
}
