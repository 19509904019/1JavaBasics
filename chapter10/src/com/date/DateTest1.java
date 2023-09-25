package com.date;

import java.util.Date;

/**
 * ClassName:DateTest
 * Description:
 *      如何将一个java.util.Date的实例转换为java.sql.Date的实例
 * @Author ZY
 * @Create 2023/9/25 22:14
 * @Version 1.0
 */
public class DateTest1 {
    public static void main(String[] args) {
        Date date1 = new Date();
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);

    }
}
