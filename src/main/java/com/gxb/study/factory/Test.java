package com.gxb.study.factory;

public class Test {
    public static void main(String[] args) {
        Eat eat = EatFactory.getEat("dog");
        eat.eat();
        Eat eat1 = EatFactory.getEat("pig");
        eat1.eat();
    }
}
