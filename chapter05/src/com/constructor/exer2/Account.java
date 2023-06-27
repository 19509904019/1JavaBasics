package com.constructor.exer2;

/**
 * ClassName:Account
 * Description:
 * 写一个名为Account的类模拟账户
 * 该类包括的属性：账号 id, 余额 balance, 年利率annualInterestRate
 * 包含的构造器：自定义
 * 包含的方法：访问器方法(getter 和 setter方法)，取款方法withdraw(), 存款方法deposit()
 *
 * @Author ZY
 * @Create 2023/6/25 14:40
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setBanlance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double a) {
        annualInterestRate = a;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void withdraw(double money) {
        if (money <= balance) {
            balance -= money;
            System.out.println("取款成功，剩余余额为：" + balance);
        } else {
            System.out.println("余额不足！");
        }
    }

    public void deposit(double money) {
        balance += money;
        System.out.println("存款成功，剩余余额为：" + balance);
    }
}
