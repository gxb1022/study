package com.gxb.study.responsibilityChain;

/**
 * 校长审批
 */
public class Master extends Approver{

    public Master(String name) {
        super(name);
    }

    @Override
    public void process(Student student) {
        if(  student.getDays()>=3){
            System.out.println("当前审批着: "+this.name +"，当前申请人： "+student.getId());
        }else {
            approver.process(student);
        }
    }
}
