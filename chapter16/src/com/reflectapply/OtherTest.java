package com.reflectapply;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * ClassName:OtherTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/10 22:11
 * @Version 1.0
 */
public class OtherTest {
    // 1.获取运行时类的父类
    @Test
    public void test1() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.reflectapply.Person");
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass); //class java.lang.Object

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);  // 带上泛型
    }

    // 2.获取运行时类实现的接口
    @Test
    public void test2() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.reflectapply.Person");

        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }

    // 3.获得运行时类所在的包
    @Test
    public void test3() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.reflectapply.Person");

        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }
    
    // 4.获取运行时类的带泛型的父类
    @Test
    public void test4() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.reflectapply.Person");
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);  // 带上泛型
    }

    // 5.获取运行时类的父类的泛型
    /*
    * 平时写的代码：
    *   类型1：业务逻辑代码（多关注）
    *   类型2：算法逻辑代码（多积累）
    * */
    @Test
    public void test5() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.reflectapply.Person");
        // 先获取父类的类型(Type是一个接口，Class实现了此接口)
        Type superclass = clazz.getGenericSuperclass();
        // 如果父类时带泛型的，则可以强转为ParameterizedType
        ParameterizedType parameterizedType = (ParameterizedType) superclass;
        // 调用getActualTypeArguments()获取泛型的参数，结果是一个数组，因为可能有多个泛型参数
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        // 获取泛型参数的名称
        System.out.println((Class)actualTypeArguments[0]);
    }
}
