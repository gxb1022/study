package com.gxb.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Nine {
    public static void main(String[] args) {
        //mopao
//        int [] nums = {7,5,9,6,4,12,3,19};
//
//        //冒泡
//        /*for (int i = 0; i < nums.length; i++) {
//            for (int k = i+1; k < nums.length; k++) {
//                if(nums[i]>nums[k]){
//                    int a = nums[i];
//                    nums[i] = nums[k];
//                    nums[k] = a;
//                }
//            }
//        }*/
//        int rows = 5;
//        int cloums = 5;
//        int startX = 0;
//        int startY = 0;
//        while (rows>startX*2 && cloums> startY*2){
//
//        }
        Student student = new Student();
        student.setStudentId("1");

        Student student1 = null;

        Optional<Student> opt = Optional.ofNullable(student1);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            final Student student2 = opt.get();
        }


//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }


    private void test(int [][] nums){
        List list = new ArrayList();
        if(nums==null || nums.length<=0){
            return;
        }
        int rows = nums.length;
        int cols = nums[0].length;
        int start = 0;
        while (rows>start*2 && cols>start*2){

        }
    }

    private void print(int [][] nums,List list,int start){
        int rows = nums.length;
        int cols = nums[0].length;

        int endX = rows-1-start;
        int endY = cols-1-start;
        //第一步
        for (int i = start; i <cols-start ; i++) {
            list.add(nums[start][i]);
        }
        //第二步
        if((rows-start)>start){
            for (int i = start+1; i < (cols-start); i++) {
                list.add(nums[i][rows-start]);
            }
        }
        if((rows-start)>start && (cols-start)>start){
            for (int i = start; i < cols-start-1; i++) {
                list.add(nums[rows-start-1][i]);
            }
        }
        if(cols-start-1>start  ){
           /* for (int k = 0; k < ; k++) {
                
            }*/
        }

    }
}
