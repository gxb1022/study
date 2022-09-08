package com.gxb.study.common;

/**
 * 类名：Test.java
 * 路径：com.test.Numeric.java
 * 创建人：tanyp
 * 创建时间： 9:31
 * 功能：判断是否是数字字符串
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class Numeric{

    public static void main(String[] args) {
        String str = null;
        System.out.println(isNumeric(str));
    }

    /**
     * 方法名：isNumeric
     * 功能：判断字符串是否是数字
     * 创建人：tanyp
     * 创建时间： 9:44
     * 入参：str：字符串
     * 出参：return：true或false
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e1) {
                try {
                    Float.parseFloat(str);
                    return true;
                } catch (NumberFormatException e2) {
                    return false;
                }
            }
        }
    }

}
