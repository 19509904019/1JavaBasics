package com._this.exer5;

/**
 * ClassName:Customer
 * Description: 生成客户的信息
 *
 * @Author ZY
 * @Create 2023/9/4 20:19
 * @Version 1.0
 */
public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;
    private String email;

    /**
     * 提供一个空参构造器
     */
    public Customer() {
    }

    /**
     * 所有参数的构造器
     */
    public Customer(String name, char gender, int age, String phoneNumber, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return name + "\t\t" + gender + "\t\t" + age + "\t\t" + phoneNumber + "\t\t" + email;
    }

}
