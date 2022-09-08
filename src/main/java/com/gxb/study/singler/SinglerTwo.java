package com.gxb.study.singler;

public class SinglerTwo {
    private static SinglerTwo singlerTwo = new SinglerTwo();

    private SinglerTwo(){

    }
    public SinglerTwo getSinglerTwo(){
        return singlerTwo;
    }
}
