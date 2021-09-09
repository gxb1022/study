package com.gxb.study;

import java.io.File;
import java.io.FileInputStream;

public class CountWords {
    public static int getCount() throws Exception {
        int count = 0;
        int currentChar;
        File file = new File("D:/study.txt");
        FileInputStream fis = new FileInputStream(file);
        while ((currentChar=fis.read()) !=-1){
            if(currentChar==' ' || currentChar == '\n'
                    || currentChar == '\t' || currentChar == '\r'){

            }else {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(getCount());
    }

}
