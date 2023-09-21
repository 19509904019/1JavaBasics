package com.Thread.threadsafe.exer1;

/**
 * ClassName:AccountTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/21 15:48
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Custom cust1 = new Custom(account, "张三");
        Custom cust2 = new Custom(account, "李四");

        cust1.start();
        cust2.start();
    }
}

// 账户类
class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amt) {  //this是不是唯一的？ yes,只有一个account
        if (amt > 0) {
            balance += amt;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()
                + "存款1000元，余额为：" + getBalance());
    }
}

class Custom extends Thread {
    Account account;

    public Custom(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
