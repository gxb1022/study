package com.gxb.study.celve;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
//        Operation operation = new MultiplyOperation();
//
//        Operation operation1 = new AddOpetation();
//
//        operation.doOperation(4,5);
//        operation1.doOperation(6,7);
//
//        Context context = new Context(new MultiplyOperation());
//        context.excuteOperation(7,8);
//
//        context = new Context(new AddOpetation());
//
//        context.excuteOperation(4,6);

        Class.forName(String.valueOf(Context.class));

        String key = "Context";

        Class<?> aClass = Class.forName(key);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();


    }
}
