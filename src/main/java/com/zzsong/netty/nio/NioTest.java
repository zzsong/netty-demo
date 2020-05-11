package com.zzsong.netty.nio;

import java.nio.IntBuffer;
import java.security.SecureRandom;

public class NioTest {

    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);

        System.out.println(buffer.capacity());
        System.out.println("limit:"+buffer.limit());
//        System.out.println("position:"+buffer.position());

        for (int i = 0; i < 6; i++) {
            int random = new SecureRandom().nextInt(20);
            System.out.println(buffer.position());
            buffer.put(random);
            System.out.println("limit:"+buffer.limit()
                    +" \t "
                    + "position:"+buffer.position()
                    +" \t random:"+random);
        }

        System.out.println("*******************************8");
        buffer.clear();
        System.out.println(buffer.get());
//        buffer.flip();
//
//        while (buffer.hasRemaining()){
////            System.out.println(buffer.get());
//            System.out.println("limit:"+buffer.limit()
//                    +" \t "
//                    + "position:"+buffer.position()
//                    + "\t"+buffer.get());
//        }
    }
}
