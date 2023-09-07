package com._4polymorphic;

/**
 * ClassName:Person
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/6 21:03
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
