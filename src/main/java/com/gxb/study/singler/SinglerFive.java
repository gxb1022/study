package com.gxb.study.singler;

public class SinglerFive {


    private SinglerFive(){}
    private static class SingleInstance{
        private static SinglerFive singlerFive = new SinglerFive();
    }
    public static SinglerFive getInstance(){
        return SingleInstance.singlerFive;
    }


}
