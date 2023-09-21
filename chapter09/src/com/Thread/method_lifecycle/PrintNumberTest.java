package com.Thread.method_lifecycle;

/**
 * ClassName:PrintNumberTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/21 12:01
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        // 子线程
        EvenNumber t1 = new EvenNumber("子线程");
        t1.setName("子线程1");
        t1.start();

        // 主线程
        Thread.currentThread().setName("主线程");
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            }

            if (i == 20) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // 子线程
        System.out.println("子线程：" + t1.isAlive());
        // 主线程
        System.out.println("主线程：" + Thread.currentThread().isAlive());
    }
}

class EvenNumber extends Thread {
    public EvenNumber() {
    }

    public EvenNumber(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            // 睡眠等待
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if(i %20 == 0){
                Thread.yield();
            }
        }
    }
}