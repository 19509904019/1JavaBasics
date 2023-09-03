package com._this.exer2;

/**
 * ClassName: Person
 * Package: com._this.exer2
 * Description:构造器中使用与类属性相同的名称
 *
 * @Create 2023/9/1 21:49
 */
public class Person {
     int age;
     String name;

     public Person(){
         // 模拟对象创建时，需要初始化50行代码
    }

    public Person(int age){
         this(); // 使用初始化的50行代码
         this.age = age;

    }
    public Person(int age, String name) {
         this(18); // 使用Person(int age)的构造器
        this.age = age;
        this.name = name;
    }

}
