package com._this.exer4;

/**
 * ClassName:Bank
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/4 14:41
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(int number){
        customers = new Customer[number];
    }

    /**
     * 顾客在银行开户后存储顾客信息
     * @param firstName
     * @param lastName
     */
    public void addCustomer(String firstName,String lastName){
        customers[numberOfCustomer] = new Customer(firstName,lastName);
        numberOfCustomer++;
    }

    /***
     * 获取存储用户的个数
     * @return
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if(index < 0 || index > numberOfCustomer){
            System.out.println("输入错误，请重新输入！");
        }

        return customers[index];
    }
}
