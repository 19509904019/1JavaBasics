package com._interface.exer4;

/**
 * ClassName:Bicycle
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/11 11:07
 * @Version 1.0
 */
public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("脚踩自行车");
    }
}
