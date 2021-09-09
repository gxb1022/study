package com.gxb.study;

public class ErFenFa {

    public static void main(String[] args) {
        int [] numbs = {1,3,5,8,10,16,18,38,45,68};
        int findValue = 38;
        int index = getIndex(numbs,0,numbs.length-1,findValue);
        System.out.println(index);
        System.out.println(numbs[index]);

        System.out.println(9/2);

    }

    private static int getIndex(int [] numbs,int startINdex,int endINdex,int findValue){
        int middle = Math.round((startINdex+endINdex)/2);
        if(numbs[middle]==findValue){
            return middle;
        }else if(numbs[middle]>findValue){
            return getIndex(numbs,startINdex,middle,findValue);
        }else if(numbs[middle]<findValue){
            return getIndex(numbs,middle,endINdex,findValue);
        }
        return -1;
    }
}
