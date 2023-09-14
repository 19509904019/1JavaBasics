package com.wrapper;

import org.junit.Test;

/**
 * ClassName:WrapperTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/13 14:11
 * @Version 1.0
 */
public class WrapperTest {
    /*
     * 基本数据类型 ---> 包装类 ： ① 使用包装类的构造器
     *                         ② (建议)调用包装类的valueOf(xxx xx)
     * 包装类 ---> 基本数据类型
     */

    @Test
    public void test1(){
        int number = 10;
//        Integer number1 = new Integer(number);
//        System.out.println(number1.toString());

        Integer number2 = Integer.valueOf(number);
        System.out.println(number2.toString());
    }

    @Test
    public void test2(){
        // 自动装箱：基本数据类型  ----> 包装类
        int number = 10;
        Integer num = number;  // 自动装箱
        System.out.println(num.toString());


        // 自动拆箱： 包装类 ---> 基本数据类型
        int number2 = num;
    }

    @Test
    public void test3(){
        String number = 123 +"";
        String number1 = String.valueOf(123);
        System.out.println(number.getClass().getSimpleName());
        System.out.println(number1.getClass().getSimpleName());

        int num = Integer.parseInt(number);

    }
}
