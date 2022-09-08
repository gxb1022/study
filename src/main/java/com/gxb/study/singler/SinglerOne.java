package com.gxb.study.singler;

public class SinglerOne {
    private static SinglerOne singlerOne;

    private SinglerOne() {

    }

    public static SinglerOne getSinglerOne(){
        if(singlerOne ==null ){
            singlerOne = new SinglerOne();
        }
        return singlerOne;
    }
}
