package com._4polymorphic.exer1;

/**
 * ClassName:Man
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/6 21:04
 * @Version 1.0
 */
public class Man extends Person {
    String name;
    int age;
    int id = 1002;

    public void eat() {
        System.out.println("男人吃饭");
    }

    public void sleep() {
        System.out.println("男人睡觉");
    }

    public void play(){
        System.out.println("打游戏");
    }
}
