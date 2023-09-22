package com.Thread.threadsafemore.communication;

/**
 * ClassName:ProducerConsumerTest
 * Description:
 * 生产者&消费者
 * 生产者（Producer）将产品交给店员（Clerk），而消费者（Consumer）从店员处取走产品，店员一次只能持有
 * 固定数量的产品（比如：20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了
 * 再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品
 * <p>
 * 分析：
 * 1. 是否是多线程问题？   是，有生产者、消费者
 * 2. 是否有共享数据？  有，产品是共享数据
 * 3. 是否有线程安全问题？  有，因为有共享数据
 * 4.是否需要处理线程安全问题？  是
 * 5.是否存在线程间的通信？  是
 *
 * @Author ZY
 * @Create 2023/9/22 13:09
 * @Version 1.0
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer1 = new Producer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        Consumer consumer2 = new Consumer(clerk);

        producer1.setName("生产者1");
        consumer1.setName("消费者1");
        consumer2.setName("消费者2");

        producer1.start();
        consumer1.start();
        consumer2.start();

    }
}


class Clerk {  // 店员
    private int productNum = 0; // 产品的数量

    // 增加产品数量的方法
    public synchronized void addProduct() {

        if (productNum < 20) {
            productNum++;
            System.out.println(Thread.currentThread().getName()
                    + "生产了第" + productNum + "个产品");

            // 生产完成后唤醒消费者
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 减少产品数量的方法
    public synchronized void reduceProduct() {
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName()
                    + "消费了第" + productNum + "个产品");
            productNum--;

            //消费完唤醒生产者
            notifyAll();
        }


    }
}


class Producer extends Thread {  // 生产者

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者开始生产产品...");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.addProduct();
        }
    }
}

class Consumer extends Thread {  // 消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者开始消费产品...");

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.reduceProduct();
        }
    }

}