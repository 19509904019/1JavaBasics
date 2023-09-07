package com._4polymorphic.exer2;

/**
 * ClassName:Woman
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/6 21:05
 * @Version 1.0
 */
public class Woman extends Person {
    String name;
    int age;

    public void eat(){
        System.out.println("女人吃饭");
    }

    public void sleep(){
        System.out.println("女人睡觉");
    }
}
