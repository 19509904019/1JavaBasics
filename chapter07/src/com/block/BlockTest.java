package com.block;

/**
 * ClassName: BlockTest
 * Package: com.block
 * Description:
 *
 * @Create 2023/9/9 15:47
 */
public class BlockTest {
    public static void main(String[] args) {
//        Person person = new Person();
//        Person per = new Person();

//        System.out.println(Person.info);
    }
}

class Person{
    String name;
    int age;
    static String info = "我是一名学生";

    public Person(){}

    public void eat(){
        System.out.println("吃饭");
    }

    // 静态代码块
    static{
        System.out.println("静态代码块1");
    }

    // 非静态代码块
    {
        System.out.println("非静态代码块1");
    }

}