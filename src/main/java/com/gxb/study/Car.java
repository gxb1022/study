package com.gxb.study;

public class Car implements Cloneable{
    private String color;
    private  String brand;

    public Car clone(){
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
