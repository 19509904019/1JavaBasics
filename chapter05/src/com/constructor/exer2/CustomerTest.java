package com.constructor.exer2;

/**
 * ClassName:CustomerTest
 * Description:
 * 创建一个Customer，名字叫Jane Smith,他有一个账号为1000，余额为2000,年利率为1.23%
 * 对Jane Smith操作：
 * 存入100元，再取出960元，再取出2000元
 * 打印出Jane Smith的基本信息
 *
 * @Author ZY
 * @Create 2023/6/25 15:08
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        // 创建Customer实例
        Customer customer = new Customer("Jane", "Smith");
//        Account account = new Account(1000, 2000, 0.0123);
//        // 通过account属性连接两个对象
//        customer.setAccount(account);
        /*
         * 匿名对象
         * 1.匿名对象往往只能被调用一次
         * 2.匿名对象常常作为实参传递给方法的形参
         * */
        customer.setAccount(new Account(1000, 2000, 0.0123));
        // 针对于客户的账户进行取钱、存钱操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

    }
}
