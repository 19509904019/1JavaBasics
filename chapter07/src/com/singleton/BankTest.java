package com.singleton;

/**
 * ClassName:BankTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/8 16:44
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {

    }
}

class Bank{

    // 1.类的构造器私有化
    private Bank(){}

    // 2.在类的内部创建当前类的实例
    // 4.此属性也必须声明为static
    private static Bank instance = new Bank();

    // 3. 使用getXxx()方法获取当前类的实例，必须声明为static
    public  static Bank getInstance(){
        return instance;
    }

}
