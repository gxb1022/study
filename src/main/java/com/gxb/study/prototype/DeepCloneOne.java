package com.gxb.study.prototype;

import java.io.*;

/**
 * 两种深拷贝的实现方式
 * 1.重写cloneable接口的clone方法
 * 2.通过序列化实现
 */
public class DeepCloneOne implements Cloneable {
    private String name;
    private int age;
    //引用类型
    private Pig pig;

    public DeepCloneOne() {
    }

    // 深度拷贝方式一 通过clone方法
    @Override
    protected Object clone() {
        Object deep = null;
        try {
            //这里完成对基本数据类型和string类型的克隆
            deep = super.clone();
            //完成对引用类型的克隆
            DeepCloneOne deepCloneOne = (DeepCloneOne) deep;
            deepCloneOne.pig = (Pig) pig.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deep;
    }

    //深度拷贝方式二 通过序列化
    public Object deepClone() throws IOException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        DeepCloneOne deepCloneOne = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前对象以流的形式输出
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepCloneOne = (DeepCloneOne) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            bos.close();
            oos.close();
            bis.close();
            ois.close();
        }

        return deepCloneOne;

    }
}
