package com.gxb.study.Builder;

public class Client {
    public static void main(String[] args) {
        Person person = new Person.PersonBulider().name("zhanggsa").age(10).build();

        Pig pig = new Pig().new PigBuilder().name("sss").colour("gf").builder();
    }

}
