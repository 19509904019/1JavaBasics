package com.Thread.threadsafemore.communication;

/**
 * ClassName:PrintNumberTest
 * Description:两个线程交替打印 1-100
 *
 * @Author ZY
 * @Create 2023/9/22 11:07
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();

        Thread t1 = new Thread(p1, "线程1");
        Thread t2 = new Thread(p1, "线程2");

        t1.start();
        t2.start();
    }
}

class PrintNumber implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    // 阻塞线程交给另外一个线程执行
                    try {
                        wait();  // 线程一旦执行此方法，就进入等待状态。同时，会释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

//                    System.out.println("hello");
                } else {
                    break;
                }
            }
        }
    }
}
