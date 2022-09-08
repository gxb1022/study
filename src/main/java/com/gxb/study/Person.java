package com.gxb.study;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Person {


    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object obj = new Person();
        System.out.println(obj.getClass().getDeclaredField("name"));
        Field name = obj.getClass().getDeclaredField("name");
        name.setAccessible(true);
         Method setName = obj.getClass().getMethod("setName", String.class);
         setName.invoke(obj,"guo");
    }
   private String name;
   private int age;
   private String address;

   public class PersonBuilder{
       private Person person;

       public PersonBuilder(){
           this.person  = new Person();
       }
       public PersonBuilder name(String name){
           this.person.name = name;
           return this;
       }

       public PersonBuilder address(String address){
           this.person.address = address;
           return this;
       }
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
