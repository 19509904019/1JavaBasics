package com.datejdk8.exer1;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:GetCurrentTime
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/26 11:17
 * @Version 1.0
 */
public class GetCurrentTime {
    /*
    * 使用Calendar获取当前时间，把这个时间设置为你的生日，再获取你出生100天的日期
    * */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 获取当前时间作为生日
        Date myBirth = calendar.getTime();
        System.out.println("你的生日为：" + myBirth);
        // 再获取100天后的日期
        calendar.add(Calendar.DAY_OF_YEAR,100);
        Date myBirthHundred = calendar.getTime();
        System.out.println("一百天后的日期为：" + myBirthHundred);
    }

    /**
     * 使用LocalDateTime获取当前时间，把这个时间设置为你的生日，再获取你出生100天的日期
     */
    @Test
    public void test(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("你的生日为：" + localDateTime);

        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println("100天后的日期为：" + localDateTime1);
    }
}
