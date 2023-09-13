package com.annotation.junit;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName:JUnitTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/13 13:06
 * @Version 1.0
 */
public class JUnitTest {

    int number = 10;

    @Test
    public void test1() {
        System.out.println("hello1");
    }

    @Test
    public void test2() {
        System.out.println("hello2");
        System.out.println("number = " + number);
    }

    @Test
    public void test() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scan.nextInt();
    }

    @Test
    public void test4(){
        System.out.println("hello");
    }
}
