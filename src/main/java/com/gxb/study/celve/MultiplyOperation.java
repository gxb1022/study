package com.gxb.study.celve;

import org.thymeleaf.util.ListUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MultiplyOperation implements Operation{

    @Override
    public void doOperation(int a, int b) {
        System.out.println("a*b="+a*b);
    }

    public static void main(String[] args) {
        String arr [] =   {"a","b","c"};

        List list = ListUtils.toList(arr);

        list.stream().forEach(System.out::println);
        System.out.println(list.stream().filter(Predicate.isEqual("c")));

        System.out.println(list.stream().count());


    }
}
