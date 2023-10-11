package com.dynamic;

import com.reflectapply.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * ClassName:DynamicTest
 * Description:反射的动态性
 *
 * @Author ZY
 * @Create 2023/10/11 14:00
 * @Version 1.0
 */
public class DynamicTest {
    // 静态性
    public Person getInstance() {
        return new Person();
    }

    // 动态性
    public <T> T getInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return (T) constructor.newInstance();
    }

    public <T> void getMethod(String className, String methodName, Object... args) throws Exception {
        // 调用类的构造器
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object obj = constructor.newInstance();

        // 形参列表参数类型
        Class<?>[] parameterType = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterType[i] = args[i].getClass();
            if(args[i].getClass() == Integer.class){
                parameterType[i] = int.class;
            }
        }

        // 调用类中的方法
        Method declaredMethod = clazz.getDeclaredMethod(methodName,parameterType); // 传入Class类型的实例
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(obj,args);

    }

    public static void main(String[] args) {
        // 静态创建对象
        DynamicTest d = new DynamicTest();
        Person p1 = d.getInstance();
        System.out.println(p1);

        // 动态创建对象
        Object p2 = null;
        try {
            p2 = d.getInstance("com.reflectapply.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(p2);

        // 使用反射调用类中的方法，方法无形参
        try {
            d.getMethod("com.reflectapply.Person", "eat");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 方法中有形参
        try {
            d.getMethod("com.reflectapply.Person", "show", "yujun", 18);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
