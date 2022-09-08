package com.gxb.study.common;


import java.math.BigDecimal;
import java.util.regex.Pattern;

/**
 * 类名：NumberUtils.java
 * 路径：com.demo.util.NumberUtils.java
 * 创建人：tanyp
 * 创建时间：
 * 功能：对数字的操作工具类（加、减、乘、除）
 * 修改人：
 * 修改时间：
 * 修改备注：
**/
public class NumberUtils {
    /**
     * 方法名：sub
     * 功能：减法运算
     * 创建人：tanyp
     * 创建时间： 17:05
     * 入参：v1:被减数 ,v2:减数
     * 出参：两个参数的差
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 方法名：add
     * 功能：加法运算
     * 创建人：tanyp
     * 创建时间： 17:05
     * 入参：v1:被加数 ,v2:加数
     * 出参：两个参数的和
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 方法名：mul
     * 功能：乘法运算
     * 创建人：tanyp
     * 创建时间： 17:06
     * 入参：v1：被乘数，v2：乘数
     * 出参：两个参数的积
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 方法名：div
     * 功能：除法运算，当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
     * 创建人：tanyp
     * 创建时间： 17:07
     * 入参：v1：被除数，v2：除数，scale：表示表示需要精确到小数点以后几位
     * 出参：两个参数的商
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 方法名：isNumeric
     * 功能：是否为整数
     * 创建人：tanyp
     * 创建时间： 17:13
     * 入参：
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }


}
