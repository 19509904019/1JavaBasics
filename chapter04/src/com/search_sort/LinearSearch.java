package com.search_sort;

import java.util.Scanner;

/**
 * ClassName:LinearSearch
 * Description:线性查找即遍历查找
 *
 * @Author ZY
 * @Create 2023/4/12 19:55
 * @Version 1.0
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] linear = {2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入目标数:");
        int target = scan.nextInt();
        //遍历查找元素
        boolean isFlag = true;
        for (int i = 0; i < linear.length; i++) {
            if (linear[i] == target) {
                System.out.println("元素存在，索引为:" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("未找到该元素！");
        }
    }
}
