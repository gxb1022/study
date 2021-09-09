package com.gxb.study;

public class TestOne {

    public static void main(String[] args) {
        int [] arrs = {0,2,8,9,10,12};
        int target = 12;
        int []positions = getLocation(arrs,target);
        System.out.println(positions);
        for (int position : positions) {
            System.out.println(position);
        }
    }

    private static int [] getLocation(int [] arrs,int target){
        for (int i = 0; i < arrs.length; i++) {
            int a = arrs[i];
            for (int k = i+1; k < arrs.length; k++){
                if(a+arrs[k]==target){
                    return new int[]{i,k};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
