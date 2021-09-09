package com.gxb.study.factory;

import java.sql.SQLOutput;

public class Dog implements Eat{

    @Override
    public void eat() {
        System.out.println("dog eating");
    }
}
