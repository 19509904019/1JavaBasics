package com.Thread.create.thread;

/**
 * ClassName:EvenNumberTest
 * Description:创建一个分线程1，用于遍历100以内的偶数
 *
 * @Author ZY
 * @Create 2023/9/20 20:19
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        // ③ 创建当前Thread的子类的对象
        PrintNumber thread1 = new PrintNumber();
        // ④ 通过对象调用start()
        thread1.start();

        /*
         *问题1：能否使用t1.run()替换t1.start()的调用，实现分线程的创建和调用？
         * 答：不能！ 使用run()方法相当于没启动线程，则此时仍为单线程
         */
//        thread1.run();


        /*
         * 问题2：再提供一个分线程，用于100以内偶数的遍历
         * 注意：不能让已经start()的线程再次执行start()，否则报异常IllegalThreadStateException
         */
        PrintNumber thread2 = new PrintNumber();
        thread2.start();

        // main()所在的线程执行的操作
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


// ① 创建一个继承Thread类的子类
class PrintNumber extends Thread {
    // ② 重写Thread类的run() ---> 将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
