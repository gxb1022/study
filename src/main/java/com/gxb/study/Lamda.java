package com.gxb.study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lamda {


    //如果没有count()方法就不会输出
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(3);
        list.add("aa");
        list.add("bb");
        list.add("cc");
        Stream<String> stream = list.stream();

    }


}
