package com.reflectexample;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName:reflectexample.ReflectionTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/10 10:32
 * @Version 1.0
 */
public class ReflectionTest {
    @Test
    public void test1(){
        Person p1 = new Person();
        // 调属性
        p1.age = 10;
        System.out.println(p1.age);
        // 调方法
        p1.show();
    }

    @Test
    public void test2() throws Exception {
        //创建Person实例
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
//        System.out.println(p1);

        // 调用属性
        Field ageField = clazz.getField("age");
        System.out.println(ageField); // public int reflectexample.Person.age
        ageField.set(p1,10);
        System.out.println(ageField.get(p1));
        System.out.println(p1);

        // 调用方法
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);
    }

    /*
    * 出了Person类之后，就不能直接调用Person类中声明的private权限修饰的结构
    * 但是可以通过反射的方式调用Person中的私有结构
    * */
    @Test
    public void test3() throws Exception {
        // 1. 调用私有的构造器，创建Person的实例
        Class<Person> clazz = Person.class;
        Constructor<Person> cons = clazz.getDeclaredConstructor(String.class, int.class);
        cons.setAccessible(true);
        Person p1 = cons.newInstance("yujun", 18);
        System.out.println(p1);

        // 调用私有属性
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true); // 使用私有属性需要调用setAccessible(true)
        nameField.set(p1,"haiyan");
        System.out.println(p1);

        // 调用私有方法
        Method eatMethod = clazz.getDeclaredMethod("eat");
        eatMethod.setAccessible(true);
        eatMethod.invoke(p1);
    }
}
