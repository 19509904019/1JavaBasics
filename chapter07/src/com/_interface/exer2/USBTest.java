package com._interface.exer2;

/**
 * ClassName:USBTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/10 21:09
 * @Version 1.0
 */


interface USB {
    // 属性
    // USB的长、宽、高

    // 方法
    public abstract void start();

    void stop();
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

class Computer {
    public void transferData(USB usb) {
        System.out.println("设备连接成功....");
        usb.start();

        System.out.println("数据传输中...");
        usb.stop();
    }
}

public class USBTest {
    public static void main(String[] args) {

        // 创建接口实现类的匿名对象
        Computer computer = new Computer();
        computer.transferData(new Printer());  // 多态

        // 创建接口匿名实现类的对象
        System.out.println();
        USB usb1 = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始读取");
            }

            @Override
            public void stop() {
                System.out.println("手机结束读取");
            }
        };
        computer.transferData(usb1);


        // 创建接口匿名实现匿名对象
        System.out.println();
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("U盘开始工作");
            }

            @Override
            public void stop() {
                System.out.println("U盘结束工作");
            }
        });

    }
}
