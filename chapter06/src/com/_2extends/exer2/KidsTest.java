package com._2extends.exer2;

/**
 * ClassName:KidsTest
 * Description:定义类KidsTest，在类的main方法中实例化Kids的对象someKid,
 *              用该对象访问其父类的成员变量及方法
 *
 * @Author ZY
 * @Create 2023/9/6 14:22
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();

        someKid.setSalary(1);
        someKid.setGender(0);
        someKid.setYearsOld(18);

        //子类方法
        someKid.printAge();

        // 父类方法
        someKid.employed();
        someKid.manOrWoman();
    }
}
