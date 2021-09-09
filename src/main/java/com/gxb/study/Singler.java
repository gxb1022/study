package com.gxb.study;

public class Singler {
    private static Singler singler;
    private Singler(){

    }
    public static Singler getSingler(){
        if(singler ==null){
            singler = new Singler();
        }
        return singler;
    }
}
