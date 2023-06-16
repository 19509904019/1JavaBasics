package com.search_sort;

/**
 * ClassName:BubbleSort
 * Description:
 *
 * @Author ZY
 * @Create 2023/4/12 21:51
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] bubble = {34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i] + "\t");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length - 1 - i; j++) {  //后面排好过后不用再进行排列
                //排序
                if (bubble[j] > bubble[j + 1]) {
                    temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i] + "\t");
        }
    }
}
