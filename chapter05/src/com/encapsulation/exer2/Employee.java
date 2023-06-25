package com.encapsulation.exer2;

/**
 * ClassName:Employee
 * Description:
 * <p>
 * 包含属性：姓名、性别、年龄、电话，属性私有化
 * 提供get/set方法
 * 提供String getInfo()方法
 *
 * @Author ZY
 * @Create 2023/6/21 10:51
 * @Version 1.0
 */
public class Employee {
    private String name;
    private int age;
    private char gender;
    private String phoneNumber;

    // 姓名
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // 年龄
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    //性别
    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return this.gender;
    }

    // 电话
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // 获取信息
    public String getInfo() {
        return  this.name + "\t" + this.gender + "\t" + this.age + "\t" + this.phoneNumber;
    }

}
