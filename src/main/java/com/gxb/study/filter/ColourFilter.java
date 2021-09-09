package com.gxb.study.filter;

import java.nio.charset.MalformedInputException;
import java.util.*;

public class ColourFilter implements DogFilter{

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(2);
        map.put("1","aa");
        map.put("2","bb");

        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());
        }
    }
    @Override
    public List<Dog> filter(List<Dog> list) {
        List<Dog> redDogs = new ArrayList<>();
        Iterator<Dog> aa = redDogs.iterator();
        aa.hasNext();
        Collections.singletonList(null);
        aa.next();
        for (Dog dog : list) {
            if("red".equals(dog.getColour())){
                redDogs.add(dog);
            }
        }
        return redDogs;
    }
}
