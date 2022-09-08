package com.gxb.study.responsibilityChain;

/**
 * 客戶端学生开始请假
 */
public class Client {
    public static void main(String[] args) {
        //创建学生请假对象
        Student student = new Student();
        student.setDays(6);
        student.setId(1);

        //创建假条审批对象
        Teacher teacher = new Teacher("张老师");
        Master master = new Master("过校长");
        ClassLeader classLeader = new ClassLeader("班長");

        //让链循环起来，给每个审批人赋值下一个审批人
        // （让校长的下一个审批人赋值为班长，这样就可以随便调用某一审批人的审批方法process(Student student)）
        //如teacher.process(student);
        classLeader.setApprover(teacher);
        teacher.setApprover(master);
        master.setApprover(classLeader);

        classLeader.process(student);

    }
}
