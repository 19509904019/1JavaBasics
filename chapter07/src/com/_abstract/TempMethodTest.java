package com._abstract;

/**
 * ClassName:TempMethodTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/10 19:27
 * @Version 1.0
 */
public class TempMethodTest {
    public static void main(String[] args) {
        PrintCode p1 = new PrintCode();
        p1.spentTime();


    }

}


abstract class Template {

    public void spentTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.print("花费的时间为：" + (end - start));
    }

    public abstract void code();
}

class PrintCode extends Template {

    public void code() {

        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }
    }
}
