package com._interface.exer3;

/**
 * ClassName:InterfaceTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/11 10:47
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.5);
        ComparableCircle c2 = new ComparableCircle(2.8);

        int compareValue = c1.compareTo(c2);

        if(compareValue > 0){
            System.out.println("c1比c2大");
        }else if(compareValue < 0 ){
            System.out.println("c2比c1大");
        }else {
            System.out.println("一样大");
        }
    }
}
