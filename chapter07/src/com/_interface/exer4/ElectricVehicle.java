package com._interface.exer4;

/**
 * ClassName:ElectricVehic
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/11 11:08
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements Power{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电能驱动电车");
    }

    public void power(){
        System.out.println("电能");
    }
}
