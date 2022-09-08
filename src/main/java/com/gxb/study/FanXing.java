package com.gxb.study;

public class FanXing <R>{
    private R clazz;

    public FanXing(R r){
        this.clazz = r;
    }

    public String getClassName(){
        return this.clazz.getClass().getName();
    }

    public static void main(String[] args) {
        Person person = new Person();
        FanXing fanXing = new FanXing(person);
        System.out.println(fanXing.getClassName());
    }
}
