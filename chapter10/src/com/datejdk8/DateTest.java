package com.datejdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * ClassName:DateTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/26 10:31
 * @Version 1.0
 */
public class DateTest {
    @Test
    public void test1() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);  // 2023-09-26
        System.out.println(localTime);  // 10:35:32.386770300
        System.out.println(localDateTime); // 2023-09-26T10:35:32.386770300

        // of():获得指定的日期、时间对应的实例
        LocalTime localTime1 = LocalTime.of(10, 25, 55);
        LocalDate localDate1 = LocalDate.of(2023, 5, 20);
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 5, 20, 11, 52, 10);
        System.out.println(localTime1);  //10:25:55
        System.out.println(localDateTime1);  //2023-05-20T11:52:10
        System.out.println(localDate1);  //2023-05-20

        // getXXX()
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getDayOfMonth()); //这个月的第几天

        //体现不可变性
        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(10);
        System.out.println(localDateTime2);  // 2023-09-26T11:41:04.803519200
        System.out.println(localDateTime3);  // 2023-09-10T11:41:04.803519200  直接设置

        LocalDateTime localDateTime4 = localDateTime2.plusDays(10);
        System.out.println(localDateTime2);  // 2023-09-26T11:41:04.803519200
        System.out.println(localDateTime4);  // 2023-10-06T11:41:04.803519200  当前时间增加天数
    }

    @Test
    public void test2() {
        // now
        Instant instant = Instant.now();
        long time = instant.toEpochMilli();
        System.out.println(instant);  //2023-09-26T02:58:45.892689100Z
        System.out.println(time);  // 1695700010329
    }

    /**
     * jdk8的api:DateTimeFormatter
     */
    @Test
    public void test3() {
        LocalDateTime localDateTime = LocalDateTime.now();
        // 自定义的格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

        // 格式化：日期、时间  ---> 字符串
        String dateStr = dtf.format(localDateTime);
        System.out.println(dateStr);

        // 解析
        TemporalAccessor localDateTime1 = dtf.parse(dateStr);
        System.out.println(localDateTime1);

        // 转为java.sql中的时间
        java.sql.Date date = new java.sql.Date(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(date);

        // 时间戳
        System.out.println(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(new Date().getTime());

    }
}
