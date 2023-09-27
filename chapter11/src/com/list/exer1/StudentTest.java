package com.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Package: com.list.exer1
 * Description:
 *
 * @Create 2023/9/27 23:03
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;
        System.out.println("请输入学生信息:");
        while (isFlag) {
            System.out.println("1.继续录入");
            System.out.println("0.结束录入");

            System.out.print("请选择：");
            int selection = scan.nextInt();

            switch (selection) {
                case 1 -> {
                    System.out.print("请输入学生姓名：");
                    String name = scan.next();
                    System.out.print("请输入学生年龄：");
                    int age = scan.nextInt();
                    list.add(new Student(name, age));
                }
                case 0 -> {
                    System.out.println("结束录入！");
                    isFlag = false;

                }
            }

        }

        for (Object o : list) {
            System.out.println(o);
        }

        scan.close();

    }
}
