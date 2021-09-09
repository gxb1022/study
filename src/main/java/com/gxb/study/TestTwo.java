package com.gxb.study;

import org.springframework.boot.json.JsonParser;

import java.util.Arrays;
import java.util.Iterator;

public class TestTwo {
    public static void main(String[] args) {
        int [] num ={1,0,5,8,0,9};

        Iterator iterator  =  Arrays.stream(num).iterator();
        int zeroNum = 0;
        while (iterator.hasNext()){
            int a = (int) iterator.next();
            if(a==0){
                iterator.remove();
                zeroNum++;
                num[num.length-zeroNum] = 0;
            }
        }
        System.out.println(num);

/*        for (int i = 0; i < num.length; i++) {
            if(num[i]==0){
                for (int k = i; k < num.length; k++) {
                    if((k+1)<num.length){
                        num[k] = num[k+1];
                    }
                }
                num[num.length-1] =0;
            }
        }*/
    }
}
