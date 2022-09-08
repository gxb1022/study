package com.gxb.study.Builder;

public class Person {
    private int age;
    private String name;
    private String school;

    public Person(PersonBulider personBulider){
        this.age = personBulider.age;
        this.name = personBulider.name;
        this.school = personBulider.school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static class PersonBulider{
        private String name;
        private int age;
        private String school;



        public PersonBulider name(String name){
            this.name = name;
            return this;
        }

        public PersonBulider age(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return  new Person(this);
        }

    }
}
