package com._interface.exer4;

/**
 * ClassName:Car
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/11 11:09
 * @Version 1.0
 */
public class Car extends Vehicle implements Power {
    private String carNumber;

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("汽油驱动油车");
    }

    public void power() {
        System.out.println("汽油");
    }
}
