package com.common_algorithm.exer;

import java.util.Scanner;

/**
 * ClassName:PrintDifferentValue
 * Description:
 * 创建一个长度自定义的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。
 * 同时，要求元素的值各不相同
 *
 * @Author ZY
 * @Create 2023/4/11 16:26
 * @Version 1.0
 */
public class PrintDifferentValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数组长度:");
        int num = scan.nextInt();
        // 定义数组
        int[] arr = new int[num];
        //随机赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) + 1;
            //判断生成的值是否重复
            boolean isFlag = true;
            while (true) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        arr[i] = (int) (Math.random() * 30) + 1;
                        isFlag = false;
                        break;
                    }
                }
                if (isFlag) {
                    break;
                }
                isFlag = true;
            }
        }
        //打印数组的值
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
