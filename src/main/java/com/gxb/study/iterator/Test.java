package com.gxb.study.iterator;

public class Test {
    public static void main(String[] args) {
        Schools schools = new Schools();
        for (Iterator iterator = schools.getIterator();iterator.hasNext();){
            String name  = (String) iterator.next();
            System.out.println(name);
        }
    }
}
