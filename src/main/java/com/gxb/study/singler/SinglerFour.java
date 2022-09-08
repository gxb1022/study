package com.gxb.study.singler;

public class SinglerFour {
    private static volatile SinglerFour singlerFour;

    private SinglerFour() {

    }

    public static SinglerFour getSinglerFour() {
        if (singlerFour == null) {
            synchronized (SinglerFour.class) {
                if (singlerFour == null) {
                    singlerFour = new SinglerFour();
                }
            }
        }
        return singlerFour;
    }
}
