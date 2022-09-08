package com.gxb.study.common;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

/**
 * 类名：LocalDateUtil.java
 * 路径：com.demo.utils.LocalDateUtil.java
 * 创建人：tanyp
 * 创建时间： 11:36
 * 功能：java8 日期格式化及时间计算
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class LocalDateUtil {

    public static void main(String[] args) {
        // 获取当前日期(yyyy-MM-dd)
        LocalDate newDate = LocalDate.now();
        System.out.println("当前日期(yyyy-MM-dd)：" + newDate);

        // 获取当前时间（HH:mm:sss）
        LocalTime newTime = LocalTime.now();
        System.out.println("当前时间(HH:mm:ss)：" + newTime);

        // 获取当前日期时间（yyyy-MM-dd HH:mm:ss）
        LocalDateTime newDateTime = LocalDateTime.now();
        System.out.println("当前日期(yyyy-MM-dd HH:mm:ss)：" + newDateTime);

        // 计算时间或日期(plus()、minus())
        // 获取过去n天或未来n天的日期
        LocalDate date7_1 = newDate.minusDays(7);
        LocalDate date7_2 = newDate.plusDays(7);
        System.out.println("获取7天前的日期：" + date7_1 + "，获取7天后的日期：" + date7_2);

        // 获取过去n月或未来n月的日期
        LocalDate month7_1 = newDate.minusMonths(7);
        LocalDate month7_2 = newDate.plusMonths(7);
        System.out.println("获取7个月前的日期：" + month7_1 + "，获取7个月后的日期：" + month7_2);

        // 备注：在java.time.LocalTime和java.time.LocalDateTime中也有对应的plus()和minus()方法。

        // 日期比较（isBefore()、isAfter()），返回true或false
        LocalDate newD = LocalDate.now();
        LocalDate lsatD = newD.plusDays(1);
        if (lsatD.isAfter(newD)) {
            System.out.println("newD小于lsatD");
        } else {
            System.out.println("newD大于lsatD");
        }

        if (lsatD.isBefore(newD)) {
            System.out.println("newD大于lsatD");
        } else {
            System.out.println("newD小于lsatD");
        }

        // 日期时间格式化（java.time.format.DateTimeFormatter）
        String date1 = newDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("日期格式化为（yyyy-MM-dd）：" + date1);

        String date2 = newDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println("日期格式化为（yyyyMMdd）：" + date2);

        String date3 = newDate.format(DateTimeFormatter.ofPattern("yyyy-MM"));
        System.out.println("日期格式化为（yyyy-MM）：" + date3);

        String date4 = newDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("日期格式化为（yyyy-MM-dd HH:mm:ss）：" + date4);

        // 获取基本属性
        int year = newDate.getYear();
        int month = newDate.getMonthValue();
        int week = newDate.getDayOfWeek().getValue();
        System.out.println("获取年份：" + year + ",月份：" + month + "，星期：" + week);

        // 计算两个日期之间相差多少天
        LocalDate localDate1 = LocalDate.of(2019, 8, 1);
        LocalDate localDate2 = LocalDate.of(2019, 8, 20);
        int num = (int) (localDate2.toEpochDay() - localDate1.toEpochDay());
        System.out.println("相差天数为：" + num);

        // 字符串转日期
        LocalDate date = LocalDate.parse("2019-08-01");
        System.out.println(date);
        // 获取某个时间在这个月的开始时间和结束时间
        LocalDate fistDate = LocalDate.parse("2019-08-28").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(fistDate);
        LocalDate lastDate = LocalDate.parse("2019-08-28").with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDate);

        System.out.println("获取星期：" + LocalDate.parse("2019-08-28").getDayOfWeek());

        System.out.println("判断是否是闰年：" + LocalDate.now().isLeapYear());

        System.out.println("每天的开始时间：" + LocalTime.MIN);
        System.out.println("每天的结束时间：" + LocalTime.MAX);

        System.out.println("获取毫秒值：" + Instant.now().toEpochMilli());

        System.out.println("两个日期的相差天数：" + ChronoUnit.DAYS.between(fistDate, lastDate));

        System.out.println("字符串转LocalDateTime：" + LocalDateTime.parse("2019-05-14 21:15:30.555", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));

        System.out.println("LocalDateTime转字符串：" + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS").format(LocalDateTime.now()));

    }

    /**
     * 方法名：getStartDayOfWeekNo
     * 功能：某周的开始日期
     * 创建人：tanyp
     * 创建时间： 13:38
     * 入参：
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static String getStartDayOfWeekNo(int year, int weekNo) {
        Calendar cal = getCalendarFormYear(year);
        cal.set(Calendar.WEEK_OF_YEAR, weekNo);
        String month = (cal.get(Calendar.MONTH) + 1) < 10 ? "0" + (cal.get(Calendar.MONTH) + 1) : String.valueOf(cal.get(Calendar.MONTH) + 1);
        String day = cal.get(Calendar.DAY_OF_MONTH) < 10 ? "0" + cal.get(Calendar.DAY_OF_MONTH) : String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        return cal.get(Calendar.YEAR) + month + day;
    }

    /**
     * 方法名：getEndDayOfWeekNo
     * 功能：某周的结束日期
     * 创建人：tanyp
     * 创建时间： 13:38
     * 入参：
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static String getEndDayOfWeekNo(int year, int weekNo) {
        Calendar cal = getCalendarFormYear(year);
        cal.set(Calendar.WEEK_OF_YEAR, weekNo);
        cal.add(Calendar.DAY_OF_WEEK, 6);
        String month = (cal.get(Calendar.MONTH) + 1) < 10 ? "0" + (cal.get(Calendar.MONTH) + 1) : String.valueOf(cal.get(Calendar.MONTH) + 1);
        String day = cal.get(Calendar.DAY_OF_MONTH) < 10 ? "0" + cal.get(Calendar.DAY_OF_MONTH) : String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        return cal.get(Calendar.YEAR) + month + day;
    }

    private static Calendar getCalendarFormYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        cal.set(Calendar.YEAR, year);
        return cal;
    }

    /**
     * 方法名：getFirstDayOfMonth
     * 功能：获取某月的第一天
     * 创建人：tanyp
     * 创建时间： 13:38
     * 入参：
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static String getFirstDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        int firstDay = cal.getMinimum(Calendar.DATE);
        cal.set(Calendar.DAY_OF_MONTH, firstDay);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }

    /**
     * 方法名：getLastDayOfMonth
     * 功能：获取某月的最后一天
     * 创建人：tanyp
     * 创建时间： 13:39
     * 入参：
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static String getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        int lastDay = cal.getActualMaximum(Calendar.DATE);
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());

    }

}
