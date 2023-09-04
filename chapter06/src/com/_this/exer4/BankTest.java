package com._this.exer4;

/**
 * ClassName:BankTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/4 15:15
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        // 创建银行对象
        Bank bank = new Bank(10);

        // 创建用户并将用户添加至银行
        bank.addCustomer("jun", "yu");
        bank.addCustomer("yan", "hai");

        // 对用户生成初始账户
        bank.getCustomer(0).setAccount(new Account(0));
        bank.getCustomer(1).setAccount(new Account(0));

        // 对帐户进行操作
        System.out.println("账户1初始余额为：" + bank.getCustomer(0).getAccount().getBalance());
        System.out.println("账户2初始余额为：" + bank.getCustomer(1).getAccount().getBalance());

        // 对帐户进行存款
        bank.getCustomer(0).getAccount().deposit(1500);
        bank.getCustomer(1).getAccount().deposit(2000);
        System.out.println("账户1余额为：" + bank.getCustomer(0).getAccount().getBalance());
        System.out.println("账户2余额为：" + bank.getCustomer(1).getAccount().getBalance());

        // 对帐户进行取款
        bank.getCustomer(0).getAccount().withdraw(500);
        bank.getCustomer(0).getAccount().withdraw(2500);
        System.out.println("账户1余额为：" + bank.getCustomer(0).getAccount().getBalance());
        System.out.println("账户2余额为：" + bank.getCustomer(1).getAccount().getBalance());


    }
}
