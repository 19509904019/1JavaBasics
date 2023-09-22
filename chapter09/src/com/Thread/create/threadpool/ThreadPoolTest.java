package com.Thread.create.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName:ThreadPoolTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/22 20:57
 * @Version 1.0
 */

// 打印奇数
class ThreadPool1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

// 打印偶数
class ThreadPool2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            }
        }
    }
}

public class ThreadPoolTest {
    public static void main(String[] args) {
        // 1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        // 设置线程池的属性,线程池中线程数的上限
        service1.setMaximumPoolSize(50);

        // 2.执行指定的线程的操作，需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new ThreadPool1());  // 适用于Runnable
        service.execute(new ThreadPool2());  // 适用于Runnable
//        service.submit(Callable callable);  // 适用于Callable

        // 3.关闭连接池
        service.shutdown();
    }
}
