package com.gxb.study.celve;

public class Context {
    private Operation operation;

    public Context(Operation operation){
        this.operation = operation;
    }

    public void excuteOperation(int a,int b){
        operation.doOperation(a,b);
    }
}
