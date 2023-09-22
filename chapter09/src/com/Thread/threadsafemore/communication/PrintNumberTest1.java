package com.Thread.threadsafemore.communication;

/**
 * ClassName:PrintNumberTest1
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/22 11:51
 * @Version 1.0
 */
public class PrintNumberTest1 {
    public static void main(String[] args) {
        PrintNumber1 p1 = new PrintNumber1();
        PrintNumber1 p2 = new PrintNumber1();

        p1.setName("线程1");
        p2.setName("线程2");

        p1.start();
        p2.start();

    }
}

class PrintNumber1 extends Thread {
    private static int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (PrintNumber1.class) {
                PrintNumber1.class.notify();  // 方法的调用者必须是同步监视器
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        PrintNumber1.class.wait(); // 方法的调用者必须是同步监视器
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    break;
                }
            }
        }
    }
}
