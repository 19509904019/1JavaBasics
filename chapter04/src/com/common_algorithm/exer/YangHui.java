package com.common_algorithm.exer;

import java.util.Scanner;

/**
 * ClassName:YangHui
 * Description:
 * 案例：使用二维数组打印一个杨辉三角,行数自定义。
 * 提示：
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *
 * @Author ZY
 * @Create 2023/4/11 15:50
 * @Version 1.0
 */
public class YangHui {
    public static void main(String[] args) {
        System.out.print("请输入杨辉三角的行数:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // 定义一个n行的二维数组
        int[][] arr = new int[num][];
        //循环添加元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        //打印数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
