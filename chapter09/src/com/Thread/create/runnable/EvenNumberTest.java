package com.Thread.create.runnable;

/**
 * ClassName:EvenNumberPrint
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/20 20:57
 * @Version 1.0
 */

// ①创建一个实现Runnable接口的类
class EvenNumberPrint implements Runnable {
    // ②实现接口中的run() ---> 将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class EvenNumberTest {
    public static void main(String[] args) {
        // ③创建当前实现类的对象
        EvenNumberPrint t1 = new EvenNumberPrint();

        // ④将此对象作为参数传递到Thread类的构造器中，创建Thread类的示例
        Thread thread = new Thread(t1);

        // ⑤Thread类的实例调用start()
        thread.start();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

        }
    }
}




