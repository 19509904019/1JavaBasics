package com._interface.jdk8;

/**
 * ClassName:CompareA
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/11 13:51
 * @Version 1.0
 */
public interface CompareA {

    // 属性：声明为public static final
    // 方法：jdk8之前：只能声明抽象方法

    // 方法：jdk8:静态方法
    public static void method1() {
        System.out.println("CompareA:北京");
    }

    // 方法：jdk8中默认方法

    public default void method2(){
        System.out.println("CompareA:南京");
    }

    public default void method3(){
        System.out.println("CompareA:上海");
    }

    public default void method4(){
        System.out.println("CompareA:广州");
    }

}
