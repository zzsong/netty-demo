package com.zzsong.netty.nio;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class NioCharsetTest {

    public static void main(String[] args) throws Exception{
        String inputFile = "txt/charsetInput.txt";
        String outputFile = "txt/charsetOutput.txt";

        RandomAccessFile inputRandomAccessFile = new RandomAccessFile(inputFile,"r");
        RandomAccessFile outputRandomAccessFile = new RandomAccessFile(outputFile,"rw");

        long inputLength = new File(inputFile).length();

        FileChannel inputFileChannel = inputRandomAccessFile.getChannel();
        FileChannel outputFileChannel = outputRandomAccessFile.getChannel();

        //内存映射文件
        MappedByteBuffer mappedByteBuffer = inputFileChannel.map(FileChannel.MapMode.READ_ONLY, 0, inputLength);

        System.out.println("************************");
        Charset.availableCharsets().forEach((k,v)-> System.out.println(k+" , "+ v));
        System.out.println("************************");
        /*
        为什么使用iso-8859-1，文件copy还是能正确显示中文?

        深入理解UTF-8，UTF-16，UTF-32？

        UTF-16BE，UTF-16LE区别？
         */
        Charset charset = Charset.forName("iso-8859-1");
        /*
        解码 ：将文件内容转换成字符/字符串的对象
         */
        CharsetDecoder decoder = charset.newDecoder();
        CharBuffer charBuffer = decoder.decode(mappedByteBuffer);

        /*
        编码：将字符/字符串转换成字节/字节数组的内容

        往磁盘上写的都是以字节/字节数组的形式。
         */
        CharsetEncoder encoder = charset.newEncoder();
        ByteBuffer outputData = encoder.encode(charBuffer);

        outputFileChannel.write(outputData);

        inputRandomAccessFile.close();
        outputRandomAccessFile.close();

    }
}
