package com.gxb.study.prototype;

public class Client {

    Pig pig  = new Pig("猪八戒",3,300.25f);

    Pig pig2 = (Pig) pig.clone();
}
