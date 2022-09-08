package com.gxb.study.celve;

public class AddOpetation implements Operation{

    @Override
    public void doOperation(int a, int b) {
        System.out.println("a+b="+a+b);
    }
}
