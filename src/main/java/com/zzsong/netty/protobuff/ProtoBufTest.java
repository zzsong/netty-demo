package com.zzsong.netty.protobuff;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zzsong.netty.protobuff.one.DataInfo;

public class ProtoBufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setId(10).setName("张三").setEmail("zansan@126.com").build();
        byte[] studentByteArray = student.toByteArray();

        DataInfo.Student student1 = DataInfo.Student.parseFrom(studentByteArray);
        System.out.println(student1);
        /**
         *  使用命令行：  protoc --java_out=src/main/java src/main/protolbuf/Student.proto
         *  生成DataInfo
         *
         *  DataInfo不要进行任何修改，生成时再次覆盖。
         *
         * 1、转换成字节数组，这就可以应用于网络传输，从客户端传输到服务端。或反之。
         * 接收字节数组再反序列化出来对象，实现了rpc数据传输。
         *
         * 2、在一端使用JAVA序列化成字节数组，传输给另一端可以使用python,C++等反序列化相应语言的对象进行直接使用。
         *
         *
         */
    }
}
