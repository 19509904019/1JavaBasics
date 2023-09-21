package com.Thread.threadsafe.synchronizedsafe;

/**
 * ClassName:WindowThreadTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/21 14:12
 * @Version 1.0
 */
public class WindowThreadTest {
    public static void main(String[] args) {
        SoldTicket1 s1 = new SoldTicket1();
        SoldTicket1 s2 = new SoldTicket1();
        SoldTicket1 s3 = new SoldTicket1();
        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        s1.start();
        s2.start();
        s3.start();
    }
}

class SoldTicket1 extends Thread {
    static int ticket = 100;

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (SoldTicket1.class) {

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}






































