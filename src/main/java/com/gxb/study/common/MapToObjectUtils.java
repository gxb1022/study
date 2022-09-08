package com.gxb.study.common;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * 类名：MapToObjectUtils.java
 * 路径：com.demo.util.MapToObjectUtils.java
 * 创建人：tanyp
 * 创建时间： 17:02
 * 功能：对数字的操作工具类（加、减、乘、除）
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class MapToObjectUtils {

    /**
     * 方法名：flushObject
     * 功能：将Map形式的键值对中的值转换为泛型形参给出的类中的属性值 t一般代表pojo类
     * 创建人：tanyp
     * 创建时间： 17:14
     * 入参：params：键值对Map数据，t：映射实体
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static <T extends Object> T flushObject(T t, Map<String, Object> params) {
        if (params == null || t == null) {
            return t;
        }

        Class<?> clazz = t.getClass();
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            try {
                Field[] fields = clazz.getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    // 获取属性的名字
                    String name = fields[i].getName();
                    Object value = params.get(name);
                    if (value != null && !"".equals(value)) {
                        // 注意下面这句，不设置true的话，不能修改private类型变量的值
                        fields[i].setAccessible(true);
                        fields[i].set(t, value);
                    }
                }
            } catch (Exception e) {
            }
        }
        return t;
    }

}
