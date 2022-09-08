package com.gxb.study;

public class Student {
    private String studentId;
    private String name;
    private String grander;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrander() {
        return grander;
    }

    public void setGrander(String grander) {
        this.grander = grander;
    }

    public class StudentBuilder{
        private Student student ;

        public StudentBuilder(){this.student = new Student();}

        public StudentBuilder name(String name){
            this.student.name = name;
            return this;
        }


    }

}
