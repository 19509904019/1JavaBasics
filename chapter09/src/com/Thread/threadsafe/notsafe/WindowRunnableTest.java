package com.Thread.threadsafe.notsafe;

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

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
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
