package com.search_sort;

/**
 * ClassName:ArrayNarrow
 * Description:数组缩容
 * 现有数组 int[] arr = {1,2,3,4,5,6,7,8},现在需要删除数组中索引为4的元素
 *
 * @Author ZY
 * @Create 2023/4/11 22:31
 * @Version 1.0
 */
public class ArrayNarrow {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
//        //不新建数组:后面元素覆盖前面元素
//        int delIndex = 4;
//        for (int i = delIndex; i < arr1.length - 1; i++) {
//            arr1[i] = arr1[i + 1];
//        }
//        arr1[arr1.length - 1] = 0;

        //新建数组
        int[] arr2 = new int[arr1.length - 1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < 4) {
                arr2[i] = arr1[i];
            } else {
                arr2[i] = arr1[i + 1];
            }
        }
        //赋给原来的数组
        arr1 = arr2;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

    }
}
