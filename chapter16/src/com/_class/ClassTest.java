package com._class;

import org.junit.Test;

/**
 * ClassName:ClassTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/10 14:16
 * @Version 1.0
 */
public class ClassTest {
    @Test
    public void test1() throws ClassNotFoundException {
        // 1.调用运行时类的静态属性：class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

        // 2.调用运行时类的对象的getClass()
        Person p1 = new Person();
        Class<? extends Person> clazz2 = p1.getClass();
        System.out.println(clazz1 == clazz2); // true
        
        // 3.调用Class的静态方法forName(String className)
        String className = "com._class.Person"; // 全类名
        Class<?> clazz3 = null;
        try {
            clazz3 = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clazz1 == clazz3); //true
        System.out.println(clazz2 == clazz3); //true

        // 4.使用类的加载器的方式
        Class<?> clazz4 = ClassLoader.getSystemClassLoader().loadClass("com._class.Person");
        System.out.println(clazz4 == clazz3); //true
    }
}
