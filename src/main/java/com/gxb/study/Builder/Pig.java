package com.gxb.study.Builder;

public class Pig {

    private String colour;
    private double weight;
    private String name;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class PigBuilder{
        private Pig pig;

        public PigBuilder(){
            this.pig = new Pig();
        }
        public PigBuilder name(String name){
            this.pig.setName(name);
            return this;
        }
        public PigBuilder colour(String colour){
            this.pig.setColour(colour);
            return this;
        }

        public Pig builder(){
            return pig;
        }
    }
}
