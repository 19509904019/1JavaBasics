package com.throwable.exer1;

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
        CompareCircle c1 = new CompareCircle(2.5);
        CompareCircle c2 = new CompareCircle(3.0);

        try {
            int compareValue = c1.compareTo(c2);

            if(compareValue > 0){
                System.out.println("c1比c2大");
            }else if(compareValue < 0 ){
                System.out.println("c2比c1大");
            }else {
                System.out.println("一样大");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
