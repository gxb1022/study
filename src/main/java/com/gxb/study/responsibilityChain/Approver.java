package com.gxb.study.responsibilityChain;

import lombok.Data;

/**
 * 请假审批
 */
@Data
public abstract class Approver {
    //下一个审批人
    Approver approver;
    //审批人名字
    String name;

    public Approver(String name){
        this.name = name;
    }

    public abstract void process(Student student);

}
