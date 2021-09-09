package com.gxb.study;

public class Test {
   private String aa;

   public class TestBuild{
       private Test test;

       public TestBuild(){
           this.test = new Test();
       }
       public TestBuild aa(String aa){
           this.test.aa = aa;
           return this;
       }
   }
}
