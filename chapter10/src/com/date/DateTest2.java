package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:DateTest2
 * Description:
 *  将控制台获取的年月日的字符串数据保存在数据库中
 * @Author ZY
 * @Create 2023/9/25 22:23
 * @Version 1.0
 */
public class DateTest2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
        Date date = sdf.parse("2021,05,25");
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }
}
