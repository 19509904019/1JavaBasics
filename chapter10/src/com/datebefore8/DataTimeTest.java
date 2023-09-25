package com.datebefore8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:DataTimeTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/25 20:53
 * @Version 1.0
 */
public class DataTimeTest {
    /*
     * Date类的使用
     *   java.util.Date
     *       > 两个构造器
     *       > 两个方法的使用：①toString()   ②getTime()
     *
     *       java.sql.Date:对应着数据库中的date类型
     *
     * */

    @Test
    public void test1() {
        Date date1 = new Date();  // 创建一个基于当前系统时间的Date的实例
        System.out.println(date1.toString());
        System.out.println(date1);

        long milliTimes = date1.getTime();
        System.out.println("对应的毫秒数：" + milliTimes);
        System.out.println("对应的毫秒数：" + System.currentTimeMillis());

        Date date2 = new Date(1493646006700L); //创建一个基于指定时间戳的Date的实例
        System.out.println(date2);
    }

    @Test
    public void test2() {
        java.sql.Date date1 = new java.sql.Date(1375254458965L);
        System.out.println(date1);  //2013-07-31
        System.out.println(date1.getTime());
    }

    /*
     * SimpleDateFormat类：用于日期时间的格式化和解析
     *
     * 格式化：日期 ---> 字符串
     * 解析：字符串 ---> 日期
     * */

    @Test
    public void test3() throws ParseException {
        // 格式化
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);

        //解析
        Date date2 = sdf.parse("2023/9/5 下午9:11");
        System.out.println(date2);
    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 格式化
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);

        // 解析:解析的时候需要和SimpleDateFormat初始化的格式相同
        Date date2 = sdf.parse("2023-10-1 22:03:40");
        System.out.println(date2);
    }

    /*
     * Calendar:日历类
     *  ①实例化 由于Calendar是一个抽象类，所以我们需要创建其子类的实例。这里我们通过Calendar的静态
     *          方法getInstance()即可获取
     *
     * 常用方法：get(int field) / set(int field, xx) / add(int field, xx)
     *          getTime() / setTime()
     * */
    @Test
    public void test5() {
        Calendar calendar = Calendar.getInstance();

        // get(int field)
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        // set(int field, xx)
        calendar.set(Calendar.DAY_OF_MONTH, 23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add(int field, xx)
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime()
        Date date1 = calendar.getTime();
        System.out.println(date1);

        //setTime():使用指定Date重置calendar
        Date date2 =new Date();
        calendar.setTime(date2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }
}
