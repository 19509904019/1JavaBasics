package com.string.exer1;

import org.junit.Test;

/**
 * ClassName:StringUser
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/23 21:35
 * @Version 1.0
 */
public class StringUser {
    @Test
    public void test1() {
        String s1 = "hello";  // 字面量的定义方式
        String s2 = "hello";

        System.out.println(s1 == s2);  // true
    }

    /**
     * String的不可变性
     * ① 当对字符串变量重新赋值时，需要重新指定一个字符串常量的位置进行赋值，不能在原有的位置修改
     * ② 当对现有的字符串进行拼接操作时，需要重新开辟空间保存拼接以后的字符串，不能在原有的位置修改
     * ③ 当调用字符串的replace()替换现有的某个字符时，需要重新开辟空间保存修改以后的字符串，不能在原有的位置修改
     */
    @Test
    public void test2() {
        String s1 = "hello";  // 字面量的定义方式
        String s2 = "hello";

        s2 = "hi";

        System.out.println(s1);
        System.out.println(s1 == s2); // false
    }

    @Test
    public void test3() {
        String s1 = "hello";  // 字面量的定义方式
        String s2 = "hello";
        String s3 = "hello";

        s3 = s2.replace('l', 'w');

        System.out.println(s1); // hello
        System.out.println(s2); // hello
        System.out.println(s3); // hewwo

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); //false
        System.out.println(s2 == s3); // false
    }

    @Test
    public void test4() {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //false
        System.out.println(s3 == s4); //false

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        System.out.println(s1.equals(s4)); //false
        System.out.println(s3.equals(s4)); //false
    }

    /**
     * 测试String的连接符
     */
    @Test
    public void test5() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";  // 这种写法调用了StringBuilder的toString()方法 ---> new String();
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); // true
        System.out.println(s3 == s5); // false
        System.out.println(s3 == s6); // false
        System.out.println(s3 == s7); // false
        System.out.println(s5 == s6); // false
        System.out.println(s5 == s7); // false

        System.out.println();
        String s8 = s5.intern(); // intern():返回的是字符串常量池中字面量的地址
        System.out.println(s8 == s3); // true
        System.out.println(s8 == s4); // true
        System.out.println(s8 == s6); // false
        System.out.println(s8 == s7); // false
    }

    @Test
    public void test6() {
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";  // 这种写法调用了StringBuilder的toString()方法 ---> new String();
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s5); // true final修饰后变成了常量
        System.out.println(s3 == s6); // true
        System.out.println(s3 == s7); // true
    }
    @Test
    public void test7() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");

        System.out.println(s3 == s4); // false
        System.out.println(s3 == s5); // false
        System.out.println(s4 == s5); // false
    }

}
