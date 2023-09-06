package com._1this.exer4;

/**
 * ClassName:Accoutn
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/4 13:49
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        } else {
            System.out.println("存款失败，请输入正确金额！");
        }
    }

    public void withdraw(double amt) {
        if (amt <= balance && amt > 0) {
            balance -= amt;
            System.out.println("取款成功，取款数额为：" + amt +"，余额为：" + balance);
        }else {
            System.out.println("取款失败，余额不足!");
        }
    }
}
