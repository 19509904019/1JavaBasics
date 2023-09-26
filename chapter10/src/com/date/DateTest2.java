package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:DateTest2
 * Description:
 * 将控制台获取的年月日的字符串数据保存在数据库中
 *
 * @Author ZY
 * @Create 2023/9/25 22:23
 * @Version 1.0
 */
public class DateTest2 {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        // 格式化
        String dateStr = sdf.format(date1);
        System.out.println(dateStr);  //2023/9/26 上午10:17

        //解析
        Date date2 = sdf.parse(dateStr);
        System.out.println(date2);  //Tue Sep 26 10:18:00 CST 2023

        //保存数据库中
        java.sql.Date date3 = new java.sql.Date(date2.getTime());
        System.out.println(date3);  //2023-09-26


    }
}
