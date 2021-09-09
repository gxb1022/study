package com.gxb.study.filter;

public class Dog {
    private String colour;
    private String gender;
    private String strain;

    public static class DogBuilder{
        private Dog dog;
        public DogBuilder(){
            this.dog = new Dog();
        }
        public DogBuilder colour(String colour){
            this.dog.colour = colour;
            return this;
        }
        public DogBuilder gender(String gender){
            this.dog.gender = gender;
            return this;
        }
        public DogBuilder strain(String strain){
            this.dog.strain = strain;
            return this;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}
