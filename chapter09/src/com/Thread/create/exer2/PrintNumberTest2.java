package com.Thread.create.exer2;

/**
 * ClassName:PrintNumberTest2
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/20 21:15
 * @Version 1.0
 */
public class PrintNumberTest2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "--->" + i);
                    }
                }
            }
        }).start();
    }
}
