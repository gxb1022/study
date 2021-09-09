package com.gxb.study;

public class Student {
    private String studentId;
    private String name;
    private String grander;

    public class StudentBuilder{
        private Student student ;

        public StudentBuilder(){this.student = new Student();}

        public StudentBuilder name(String name){
            this.student.name = name;
            return this;
        }


    }

}
