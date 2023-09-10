package com._interface.exer1;

/**
 * ClassName:InterfaceTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/10 20:44
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
    }
}

interface Flyable {    // 接口
    // 全局常量
    public static final int MIN_SPEED = 0;
    //public static final int MAX_SPEED = 1000;
    //可以省略public static final
    int MAX_SPEED = 1000;


    //方法
    //public abstract void fly();
    //方法可以省略public abstract
    void fly();
}

interface Attackable {  // 接口
    public abstract void attack();
}

class Plane implements Flyable {
    @Override
    public void fly() {

    }
}

// 一个子类可以实现多个接口
class Bullet implements Flyable, Attackable {
    @Override
    public void fly() {

    }

    @Override
    public void attack() {

    }
}



// 测试接口的继承关系
interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{  // 接口可以多继承


}

class DD implements CC{  // 将两个方法都重写

    @Override
    public void method2() {

    }

    @Override
    public void method1() {

    }
}
