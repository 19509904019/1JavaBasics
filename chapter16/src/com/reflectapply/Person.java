package com.reflectapply;

/**
 * ClassName:reflectexample.Person
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/10 10:38
 * @Version 1.0
 */

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface CustomAnnotation {
    String value();

    int priority() default 0;
}

public class Person {
    private String name;
    public int age;
    static String info;

    public Person() {
        System.out.println("Person()...");
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @CustomAnnotation(value = "Performing operation", priority = 2)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void show(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("show():我是" + name + ",年龄" + age);
    }

    public void eat() {
        System.out.println("eat()...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void sleep(){
        System.out.println("sleep()...");
    }
}
