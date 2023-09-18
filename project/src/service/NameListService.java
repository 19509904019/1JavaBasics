package service;

import domain.*;

import javax.sound.sampled.Port;

import static service.Data.*;

/**
 * ClassName: NameListService
 * Package: service
 * Description:负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 *
 * @Create 2023/9/16 15:45
 */

/*
 * 根据项目提供的Data类构建相应大小的employees数组
 * 再根据Data类中的数据构建不同对象，包括Employee、Programmer、Designer和Architect对象，
 *   以及相关联的Equipment子类的对象
 * Data类位于service包中
 * */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        // 存储员工信息数组
        employees = new Employee[Data.EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            // 员工类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            // 获取通用的属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);



            switch (type) {
                case EMPLOYEE -> new Employee(id,name,age,salary);
                case PROGRAMMER -> {
                    Equipment equipment = createEquipment(i);
                    new Programmer(id,name,age,salary, equipment);
                }
                case DESIGNER -> new Designer();
                case ARCHITECT -> new Architect();
            }

        }
    }

    private Equipment createEquipment(int index){
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);
        
    }

    public Employee[] getAllEmployees() {
        return null;
    }

    public Employee getEmploy(int id) {
        return null;
    }
}
