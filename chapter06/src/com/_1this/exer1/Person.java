package com._1this.exer1;

/**
 * ClassName: Person
 * Package: com._this.exer1
 * Description: 方法中的形参与类属性相同
 *
 * @Create 2023/9/1 21:24
 */
public class Person {
    private int age;
    private String name;


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(18);
        p1.setName("阿燕");
        System.out.println("姓名：" + p1.getName());
        System.out.println("年龄：" + p1.getAge());

    }
    //形参与类属性重名时，在类属性前使用this关键字
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
