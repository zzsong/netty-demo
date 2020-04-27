package com.zzsong.netty.thrift.one.server;

import com.zzsong.netty.thrift.one.InvalidException;
import com.zzsong.netty.thrift.one.MyDataService;
import com.zzsong.netty.thrift.one.Operation;
import com.zzsong.netty.thrift.one.Work;
import org.apache.thrift.TException;

public class MyDataServiceImpl implements MyDataService.Iface {
    @Override
    public int add(int a, int b) throws TException {
        return a+b;
    }

    @Override
    public int cal(int id, Work work) throws InvalidException, TException {
        Operation op = work.op;
        switch (op){
            case ADD:
                return id+2;
            case DIVIDE:
                return id/2;
            case MULTIPLY:
                return id*2;
            case SUBTRACT:
                return id-2;
        }
        return 0;
    }
}
