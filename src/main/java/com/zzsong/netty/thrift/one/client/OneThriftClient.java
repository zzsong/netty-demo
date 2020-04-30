package com.zzsong.netty.thrift.one.client;

import com.zzsong.netty.thrift.one.MyDataService;
import com.zzsong.netty.thrift.one.Operation;
import com.zzsong.netty.thrift.one.Work;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class OneThriftClient {

    public static void main(String[] args) {
        TTransport transport = new TFramedTransport(new TSocket("localhost",8989), 600);
        TProtocol protocol = new TCompactProtocol(transport);
        MyDataService.Client client = new MyDataService.Client(protocol);

        try {
            transport.open();

            int sum = client.add(10,20);
            System.out.println("sum==>"+sum);

            Work work = new Work();
            work.setOp(Operation.MULTIPLY);
            int cal = client.cal(10, work);
            System.out.println("cal==="+cal);
        } catch (Exception e){
            throw new RuntimeException(e);
        } finally {
            transport.close();
        }

    }
}
