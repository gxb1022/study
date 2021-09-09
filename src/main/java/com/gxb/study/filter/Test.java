package com.gxb.study.filter;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static final String c = null;
    public static void main(String[] args) {
        List<Dog.DogBuilder> list = new ArrayList<>();
        Dog.DogBuilder dogBuilder = new Dog.DogBuilder();
        dogBuilder.colour("red").gender("1");
        list.add(dogBuilder);

        final String a = "2";
        final String b = "ggg";
    }

}
