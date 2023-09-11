package com._interface.jdk8;

/**
 * ClassName:SubClass
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/11 13:53
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA,CompareB{
    @Override
    public void method2() {
        System.out.println("SubClass:南京");
    }

    public void method3(){
        System.out.println("SubClass:上海");
    }

    public void method4(){
        System.out.println("SubClass:广州");
    }

    public void method(){
        // 知识点5：如何在子类（或实现类）中调用父类或接口中被重写的方法
        method4();
        this.method4();
        super.method4();
        CompareA.super.method3();  // 调用接口CompareA中的默认方法

    }

}
