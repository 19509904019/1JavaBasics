package com._4polymorphic.exer4;

/**
 * ClassName:Dog
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/7 11:56
 * @Version 1.0
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗睡觉");
    }

    public void watchDoor(){
        System.out.println("狗看家");
    }
}
