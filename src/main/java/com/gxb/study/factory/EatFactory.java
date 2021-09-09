package com.gxb.study.factory;

public class EatFactory {
    public static Eat getEat(String type){
        if("dog".equals(type)){
            return new Dog();
        }else if("pig".equals(type)){
            return new Pig();
        }else {
            return null;
        }
    }
}
