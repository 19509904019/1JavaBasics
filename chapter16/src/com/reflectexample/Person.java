package com.reflectexample;

/**
 * ClassName:reflectexample.Person
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/10 10:38
 * @Version 1.0
 */
public class Person {
    private String name;
    public int age;

    public Person() {
        System.out.println("reflectexample.Person()...");
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void show(){
        System.out.println("show()...");
    }
    private void eat(){
        System.out.println("eat()...");
    }

    @Override
    public String toString() {
        return "reflectexample.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
