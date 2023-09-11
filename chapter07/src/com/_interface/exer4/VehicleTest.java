package com._interface.exer4;

/**
 * ClassName:VehicleTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/11 11:22
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        // 员工对象
        Developer developer = new Developer();

        // 对象数组
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "红色");
        vehicles[1] = new ElectricVehicle("雅迪", "蓝色");
        vehicles[2] = new Car("别克", "黑色", "沪A88888");
        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);

            if(vehicles[i] instanceof Power){  // 是否存在接口
                ((Power) vehicles[i]).power();
            }
        }
    }
}
