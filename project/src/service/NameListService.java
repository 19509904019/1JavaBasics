package service;

import domain.*;

import static service.Data.*;

/**
 * ClassName:NameListService
 * Description:负责将Data中的数据封装到Employee[]数组中，同时提供相关操作
 *              Employee[]的方法
 *
 * @Author ZY
 * @Create 2023/9/19 11:01
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        // 构建与Data类相同大小的数组
        employees = new Employee[EMPLOYEES.length];

        /*
        根据数据构建不同的对象
        */
        for (int i = 0; i < employees.length; i++) {

            // 共有属性
            int employeeType = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;

            switch (employeeType) {
                case EMPLOYEE -> employees[i] = new Employee(id, name, age, salary);
                case PROGRAMMER -> {
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                }
                case DESIGNER -> {
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                }
                case ARCHITECT -> {
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                }
            }
        }
    }

    /**
     * 提供设备信息方法
     *
     * @param index 指定员工的角标
     * @return 返回指定员工的设备信息
     */
    private Equipment createEquipment(int index) {
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);

        // 共有属性
        String modelOrName = EQUIPMENTS[index][1];
        String dispalyOrTypeOrPrice = EQUIPMENTS[index][2];
        switch (equipmentType) {
            case PC -> {
                return new PC(modelOrName, dispalyOrTypeOrPrice);
            }
            case NOTEBOOK -> {
                double price = Double.parseDouble(dispalyOrTypeOrPrice);
                return new NoteBook(modelOrName, price);
            }
            case PRINTER -> {
                return new Printer(modelOrName, dispalyOrTypeOrPrice);
            }
        }
        return null;
    }

    /**
     * 获取当前所有员工
     *
     * @return 返回所有员工的地址值
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * 获取指定员工ID的员工对象
     *
     * @param id 指定员工的id
     * @return 指定员工对象
     * @throws TeamException 找不到指定的员工
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            // 找到了员工
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }

        // 没找到则抛出异常
        throw new TeamException("找不到指定的员工");
    }
}
