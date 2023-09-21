package com.Thread.threadsafe.syncmethod;

/**
 * ClassName:WindowTest
 * Description:
 * 使用实现Runnable接口的方式，实现卖票 ---> 存在线程安全问题
 * 使用同步代码块解决上述卖票中的线程安全问题
 *
 * @Author ZY
 * @Create 2023/9/21 12:51
 * @Version 1.0
 */
class SoldTicket implements Runnable {

    int ticket = 100;
    boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag) {
            show();
        }
    }

    public synchronized void show() {  // 此时的同步监视器是this

        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        } else {
            isFlag = false;
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
