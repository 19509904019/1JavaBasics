package com._4polymorphic.exer4;

/**
 * ClassName:Cat
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/7 11:58
 * @Version 1.0
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    @Override
    public void sleep(){
        System.out.println("猫睡觉");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

}
