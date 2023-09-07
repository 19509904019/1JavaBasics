package com._4polymorphic;

/**
 * ClassName:PersonTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/6 21:06
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        // 没学继承之前
        Person person = new Person();
        Man man = new Man();
        Woman woman = new Woman();

        // 多态性：子类对象的多态性
        Person person1 = new Man();

        /*
         * 多态的应用：虚拟方法调用
         *
         * 在多态的场景下,调用方法时，编译看左边，运行看右边
         */

        person.eat();
        person1.eat();
        person1.sleep();

        // 测试属性是否满足多态性？不满足
        System.out.println(person1.id); // 1001

        /*
         *多态的弊端
         * 问题：Person person1 = new Man();
         *
         * 针对于创建的对象，在内存中是否加载了Man类中声明的特有的属性和方法？ 加载了！
         * 能不能直接调用Man中加载的特有的属性和方法？ 不能
         */
//        person1.play();  //只能调用父类中拥有的方法，不能调用子类中特有的方法


    }
}
