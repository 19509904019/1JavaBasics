package com._this.exer3;

/**
 * ClassName:BoyGirlTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/4 9:32
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("jack", 26);
        Girl girl1 = new Girl("rose", 24);

        girl1.marry(boy1);
        boy1.shout();

        Girl girl2 = new Girl("Amy", 20);
        int compare = girl1.compare(girl2);
        if (compare > 0) {
            System.out.println(girl1.getName() + "大");
        } else if (compare < 0) {
            System.out.println(girl2.getName() + "大");
        } else {
            System.out.println("一样大");
        }
    }
}
