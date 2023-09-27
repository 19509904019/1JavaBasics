package com.list.exer1;

import java.util.Objects;

/**
 * ClassName: Student
 * Package: com.list.exer1
 * Description:
 * 学生类，属性为姓名、年龄，提供必要的getter、setter方法，构造器，toString()，equals()方法
 *
 * @Create 2023/9/27 22:59
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

}
