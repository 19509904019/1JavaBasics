package com.string.exer6;

import java.util.Arrays;

/**
 * ClassName:Stringsort
 * Description:
 * 对字符串中字符进行自然顺序排序
 * 提示：
 * （1） 字符串变成字符数组
 * （2） 对数组排序，选择，冒泡，Arrays.sort()
 * （3） 将排序后的数组变成字符串
 *
 * @Author ZY
 * @Create 2023/9/25 15:50
 * @Version 1.0
 */
public class StringSort {
    public static void main(String[] args) {
        String str1 = "sawqiorhajfvajfafmkajf";
        StringSort stringSort = new StringSort();
        System.out.println(stringSort.stringSort(str1));
        System.out.println(stringSort.stringSort1(str1));
    }

    public String stringSort(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }

    public String stringSort1(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
