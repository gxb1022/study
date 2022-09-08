package com.gxb.study.prototype;

public class Pig implements Cloneable{

    private String name;
    private int age;
    private float weight;

    public Pig(String name,int age,float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    protected Object clone() {
        Pig pig = null;
        try {
            pig = (Pig) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pig;
    }
}
