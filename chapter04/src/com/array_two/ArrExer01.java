package com.array_two;

import java.util.Scanner;

/**
 * ClassName:ArrExer01
 * Description:键盘输入任意数，计算二维数组中所有元素的和
 *
 * @Author ZY
 * @Create 2023/4/10 21:50
 * @Version 1.0
 */
public class ArrExer01 {
    public static void main(String[] args) {
        // 初始化总和
        int sum = 0;
        // 输入数组的值
        Scanner scan = new Scanner(System.in);
        // 输入二维数组的大小
        System.out.print("请输入二维数组的行：");
        int x = scan.nextInt();
        System.out.print("请输入二维数组的列：");
        int y = scan.nextInt();
        double[][] arr = new double[x][y];
        //对数组输入值
        System.out.println("输入二为数组的值:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();
            }
        }
        //输出数组并计算总和
        System.out.println("您输入的二维数组为：");
        for (double[] doubles : arr) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "\t");
                sum += aDouble;
            }
            System.out.println();
        }
        System.out.println("数组中所有元素的和为:" + sum);
    }
}
