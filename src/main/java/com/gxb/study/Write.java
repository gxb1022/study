package com.gxb.study;

import java.io.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Write {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
     /*   String s = new String("abc");
        final Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,"abcd".toCharArray());
        System.out.println(s);
        HashMap map = new HashMap(2);*/

        AtomicInteger vv = new AtomicInteger(5);
        System.out.println(vv);
        vv.set(6);
        System.out.println(vv);
        //cao cao


    }

}
