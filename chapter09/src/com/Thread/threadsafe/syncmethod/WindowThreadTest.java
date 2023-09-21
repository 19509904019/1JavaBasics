package com.Thread.threadsafe.syncmethod;

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
    static boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag) {

            show();
        }
    }

    public static synchronized void show() { // 此时同步监视器为this,此处this为s1,s2,s3
        if (ticket > 0) {
            try {
                Thread.sleep(100);
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






































