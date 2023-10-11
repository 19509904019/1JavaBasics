package com.reflectapply;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * ClassName:NewInstanceTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/10 19:22
 * @Version 1.0
 */
public class NewInstanceTest {
    @Test
    public void test1() throws Exception {
        Class<Person> clazz = Person.class;

        // 创建Person类的实例
        Person p1 = clazz.newInstance();

        System.out.println(p1);

        // 找到变量
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);  // 私有属性需要获得授权
        Field ageField = clazz.getField("age");

        // 赋值
        nameField.set(p1, "yujun");
        ageField.setInt(p1, 18);
        System.out.println(p1);
    }

    /**
     * 权限修饰符、变量类型、变量名
     */
    @Test
    public void test2() {
        Class<Person> clazz = Person.class;
        Field[] declaredField = clazz.getDeclaredFields();  // 包含声明的权限修饰符、数据类型、变量名

        /*
         * public    1
         * private   2
         * protected 4
         * static    8
         * final     16
         * */
        for (Field field : declaredField) {
            // 权限修饰符
            int modifiers = field.getModifiers();
            System.out.print(modifiers + ":" + Modifier.toString(modifiers) + "\t");

            // 数据类型
            Class<?> type = field.getType();
            System.out.print(type.getName() + "\t");

            // 变量名
            String name = field.getName();
            System.out.println(name);
        }
    }

    @Test
    public void test3() {
        Class<Person> clazz = Person.class;

        // getMethods()：获取到运行时类本身及其所有的父类中声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    @Test
    public void test4() {
        Class<Person> clazz = Person.class;

        // getMethods()：获取到运行时类本身中声明为public权限的方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    // 注解信息
    @Test
    public void test5() {
        Class<Person> clazz = Person.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            // 1. 获取方法声明的注解
            if (m.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation annotation = m.getAnnotation(CustomAnnotation.class);
                System.out.print("value:" + annotation.value() + "\t");
                System.out.println("priority:" + annotation.priority());
            }

            // 2.权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            // 3.返回值类型
            System.out.print(m.getAnnotatedReturnType() + "\t");

            // 4.方法名
            System.out.print(m.getName() + "\t");

            // 5.形参列表,循环遍历
            System.out.print("(");
            Class<?>[] parameterTypes = m.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                // 打印最后一个变量名
                if (i == parameterTypes.length - 1) {
                    System.out.print(parameterTypes[i].getName());
                    break;
                }
                System.out.print(parameterTypes[i].getName() + ",");

            }
            System.out.println(")");

            // 6.抛出异常
        }
    }
}
