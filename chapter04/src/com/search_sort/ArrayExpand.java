package com.search_sort;

import java.util.Scanner;

/**
 * ClassName:ArrayExpand
 * Description:数组扩容
 *
 * @Author ZY
 * @Create 2023/4/11 22:30
 * @Version 1.0
 */
public class ArrayExpand {
    public static void main(String[] args) {
        System.out.print("输入数组的长度:");
        Scanner scan = new Scanner(System.in);
        int len1 = scan.nextInt();
        int[] arr1 = new int[len1];
        //输入数组的数
        System.out.println("输入数组元素:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        //数组扩容一倍
        int[] arr2 = new int[arr1.length << 1];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length + 1] = 14;
        arr2[arr1.length + 2] = 18;

        //将新的数组地址赋给原来的数组
        arr1 = arr2;

        //打印扩容后的数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }

}
