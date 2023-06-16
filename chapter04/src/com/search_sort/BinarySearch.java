package com.search_sort;

import java.util.Scanner;

/**
 * ClassName:BinarySort
 * Description:二分查找法
 * 三个指针：head mid end
 * 前提条件是有序数组
 *
 * @Author ZY
 * @Create 2023/4/12 20:47
 * @Version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] binary = {2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        int head = 0;
        int end = binary.length - 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入目标数:");
        int target = scan.nextInt();
        while (true) {
            //中间指针为首尾之和除2
            int mid = (head + end) / 2;
            if (head <= end) {
                //找到目标元素
                if (binary[mid] == target) {
                    System.out.println("元素存在，索引为:" + mid);
                    break;
                } else if (binary[mid] > target) {
                    //中间值大于目标值，想左查找
                    end = mid - 1;
                } else {
                    //中间值小于目标值，向右查找
                    head = mid + 1;
                }
            }else {
                System.out.println("未找到该元素！");
                break;
            }

        }
    }
}
