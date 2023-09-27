package com.search_sort;

import java.util.Arrays;

/**
 * ClassName:QuickSort
 * Description:快速排序
 *
 * @Author ZY
 * @Create 2023/4/12 22:35
 * @Version 1.0
 */
public class QuickSort {

    // 快速排序划分
    public int Partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            // 高位数小于pivot，向低位移动
            while (low < high && arr[high] >= pivot)
                high--;
            arr[low] = arr[high];
            // 低位数大于pivot，向高位移动
            while (low < high && arr[low] <= pivot)
                low++;
            arr[high] = arr[low];
        }
        arr[low] = pivot; // low == high,无论low还是high的位置都可以
        return low;
    }

    // 快速排序：递归
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int position = Partition(arr, low, high);
            quickSort(arr, low, position - 1);
            quickSort(arr, position + 1, high);
        }
    }

    public static void main(String[] args) {
        // 待排序的数
        int[] arr = new int[]{49, 38, 65, 97, 76, 13, 27, 49};
        // 初始化
        int low = 0;
        int high = arr.length - 1;
        // 进行排序
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr)); // 输出数组
    }
}

