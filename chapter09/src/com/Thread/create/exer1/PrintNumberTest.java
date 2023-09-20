package com.Thread.create.exer1;

/**
 * ClassName:PrintNumberTest
 * Description:多线程打印奇偶数
 *
 * @Author ZY
 * @Create 2023/9/20 20:41
 * @Version 1.0
 */
public class PrintNumberTest extends Thread {
    public static void main(String[] args) {
        // 创建Thread类的匿名子类的匿名对象打印偶数
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        // 创建Thread类的匿名子类的匿名对象打印奇数
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "-->" + i);
                    }
                }
            }
        }.start();
    }
}

