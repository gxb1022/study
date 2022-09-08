package com.gxb.study.responsibilityChain;

/**
 * 班长审批
 */
public class ClassLeader extends Approver{
    public ClassLeader(String name) {
        super(name);
    }

    @Override
    public void process(Student student) {
        if(student.getDays()>0 && student.getDays()<=2){
            System.out.println("班長");
        }else {
            approver.process(student);
        }
    }
}
