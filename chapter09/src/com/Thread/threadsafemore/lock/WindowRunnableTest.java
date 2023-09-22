package com.Thread.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:WindowTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/21 12:51
 * @Version 1.0
 */
class SoldTicket implements Runnable {

    int ticket = 100;
    // 创建lock的实例，需要确保多个线程共用同一个Lock实例
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            // 2. 执行lock()方法，锁定对共享资源的调用
            lock.lock();
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        } finally {
            // 3.unlock()的调用释放对共享数据的调用
            lock.unlock();
        }
    }
}

public class WindowRunnableTest {
    public static void main(String[] args) {
        SoldTicket soldTicket = new SoldTicket();
        // 三个窗口
        Thread t1 = new Thread(soldTicket, "窗口1");
        Thread t2 = new Thread(soldTicket, "窗口2");
        Thread t3 = new Thread(soldTicket, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}
