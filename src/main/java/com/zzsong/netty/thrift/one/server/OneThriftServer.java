package com.zzsong.netty.thrift.one.server;

import com.zzsong.netty.thrift.one.MyDataService;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;

public class OneThriftServer {

    public static void main(String[] args) throws TTransportException {
        TNonblockingServerSocket socket = new TNonblockingServerSocket(8989);
        THsHaServer.Args arg = new THsHaServer.Args(socket).minWorkerThreads(2).maxWorkerThreads(4);
        MyDataService.Processor<MyDataServiceImpl> processor = new MyDataService.Processor<>(new MyDataServiceImpl());

        //协议层使用对象
        //协议是比较高层的，可以用户指定
        //压缩协议：二进制压缩包协议，生成字节码文件，尽最大压缩成容量最小的协议
        arg.protocolFactory(new TCompactProtocol.Factory());
        //传输层所使用到的对象
        //传输层：指底层以什么形式，从一端传输到另外一端。
        arg.transportFactory(new TFramedTransport.Factory());
        arg.processorFactory(new TProcessorFactory(processor));

        //
        TServer server = new THsHaServer(arg);
        System.out.println("Thrift Server Started!");

        //进入死循环
        server.serve();

    }
}
