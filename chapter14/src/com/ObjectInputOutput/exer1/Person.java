package com.ObjectInputOutput.exer1;

import java.io.Serializable;

/**
 * ClassName:Person
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/8 21:38
 * @Version 1.0
 */
public class Person implements Serializable {  // Serializable属于一个标识接口
    transient String name;
    private int age;
    static final long serialVersionUID = 466164416546L;

    public Person() {
    }

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
