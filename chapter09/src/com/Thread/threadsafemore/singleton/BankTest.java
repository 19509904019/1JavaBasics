package com.Thread.threadsafemore.singleton;

/**
 * ClassName:BankTest
 * Description:
 * 实现线程安全的懒汉式
 *
 * @Author ZY
 * @Create 2023/9/21 16:39
 * @Version 1.0
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);


    }
}

class Bank {

    private Bank() {
    }

    private static volatile Bank instance = null;

//    // 实现线程安全方式1
//    public static synchronized Bank getInstance() {  // 同步监视器，默认为Bank.class
//        if (instance == null) {
//            // 线程1进来后不着急获取地址，等待线程2进来后，发生了线程安全问题
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            instance = new Bank();
//        }
//        return instance;
//    }


//    // 实现线程安全方式2
//    public static Bank getInstance() {  // 同步监视器，默认为Bank.class
//        synchronized (Bank.class) {
//            if (instance == null) {
//                // 线程1进来后不着急获取地址，等待线程2进来后，发生了线程安全问题
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                instance = new Bank();
//            }
//            return instance;
//        }
//    }

    // 实现线程安全方式3:相较于方式1和方式2效率更高。为了避免出现指令重排，需要将instance声明为volatile
    // volatile:
    //      可见性： 确保所有线程都能看到变量的最新值。
    //      有序性： 禁止指令重排序优化，保证代码的执行顺序与程序代码的顺序一致。
    public static Bank getInstance() {  // 同步监视器，默认为Bank.class
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    // 线程1进来后不着急获取地址，等待线程2进来后，发生了线程安全问题
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}

