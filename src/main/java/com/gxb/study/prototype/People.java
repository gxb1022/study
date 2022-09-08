package com.gxb.study.prototype;

import lombok.Data;

@Data
public class People implements Cloneable{
    private String name;
    private int age;
    private Pig pig;
}
