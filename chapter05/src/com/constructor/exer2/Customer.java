package com.constructor.exer2;

/**
 * ClassName:Customer
 * Description:
 * 声明三个私有对象属性，firstName，lastName和account
 * 声明一个公有构造器，这个构造器带有两个代表对象属性的参数(f和 l)
 * 声明两个公有存取器来访问该对象属性，方法getFirstName和getLastName返回相应的属性
 * 声明setAccount方法来对account属性赋值
 * 声明getAccount方法以获取account属性
 *
 * @Author ZY
 * @Create 2023/6/25 14:52
 * @Version 1.0
 */
public class Customer {
    private final String firstName;
    private final String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
