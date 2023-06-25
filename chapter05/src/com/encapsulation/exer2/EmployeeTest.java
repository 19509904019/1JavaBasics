package com.encapsulation.exer2;

import java.util.Scanner;

/**
 * ClassName:EmployeeTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/6/21 11:09
 * @Version 1.0
 */
public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] emp = new Employee[2];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < emp.length; i++) {
            // 数组元素为对象
            emp[i] = new Employee();
            System.out.println("----------添加第" + (i + 1) + "个员工----------");
            System.out.print("姓名：");
            String name = scan.next();
            System.out.print("性别：");
            char gender = scan.next().charAt(0);
            System.out.print("年龄：");
            int age = scan.nextInt();
            System.out.print("电话：");
            String phoneNumber = scan.next();

            // 给指定的各个对象赋值
            emp[i].setName(name);
            emp[i].setGender(gender);
            emp[i].setAge(age);
            emp[i].setPhoneNumber(phoneNumber);
        }

        // 遍历员工列表
        System.out.println("------------员工列表------------");
        System.out.println("编号" + "\t" + "姓名" + "\t" + "性别" + "\t" + "年龄" +
                "\t" + "电话");
        for (int i = 0; i < emp.length; i++) {
            System.out.println((i + 1) + "\t" + emp[i].getInfo() + "\t");
        }
        System.out.println("-----------员工列表完成----------");

    }
}
