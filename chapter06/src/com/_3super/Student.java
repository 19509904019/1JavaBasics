package com._3super;

/**
 * ClassName:Student
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/6 17:18
 * @Version 1.0
 */
public class Student extends Person {
    // 属性
    String school;
    int id = 1002;

    // 方法
    public void paly() {
        System.out.println("上网打游戏");
    }

    public void eat() {
        System.out.println("学生吃饭");
    }

    public void sleep() {
        System.out.println("学生睡觉");
    }

    // 在子类使用super调用未被重写的父类方法
    public void show(){
        eat();
        this.eat(); // 等同于eat();
        super.eat();

    }

    public void show1(){
        System.out.println(id); // 等同于this.id
        System.out.println(super.id);
    }
}
