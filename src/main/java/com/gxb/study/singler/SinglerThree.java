package com.gxb.study.singler;

public class SinglerThree {
    private static SinglerThree singlerThree;

    private SinglerThree (){

    }

    public SinglerThree getSinglerThree(){
        synchronized (this){
            if(singlerThree == null){
                singlerThree = new SinglerThree();
            }
            return singlerThree;
        }
    }
}
