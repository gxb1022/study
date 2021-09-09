package com.gxb.study;

public class Person {
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
