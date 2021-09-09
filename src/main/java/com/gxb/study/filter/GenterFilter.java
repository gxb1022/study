package com.gxb.study.filter;

import java.util.ArrayList;
import java.util.List;

public class GenterFilter implements DogFilter{
    @Override
    public List<Dog> filter(List<Dog> list) {
        List<Dog> maleDogs = new ArrayList<Dog>();
        for (Dog dog : list) {
            if("1".equals(dog.getGender())){
                maleDogs.add(dog);
            }
        }
        return maleDogs;
    }
}
