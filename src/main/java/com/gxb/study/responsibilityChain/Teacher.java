package com.gxb.study.responsibilityChain;

/**
 * 老师审批
 */
public class Teacher extends Approver{

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void process(Student student) {
        if(student.getDays()> 2 && student.getDays()<=3){
            System.out.println("当前审批着: "+this.name +"，当前申请人： "+student.getId());
        }else {
            approver.process(student);
        }
    }
}
