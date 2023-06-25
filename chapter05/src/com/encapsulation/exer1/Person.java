package com.encapsulation.exer1;

/**
 * ClassName:Person
 * Description:
 *
 * @Author ZY
 * @Create 2023/6/21 10:39
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int setage) {
        if (setage >= 0 && setage <= 130) {
            age = setage;
        } else {
            System.out.println("输入的年龄不合法！");
        }
    }

    public int getAge(){
        return age;
    }
}
