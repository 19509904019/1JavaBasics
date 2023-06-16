package com.common_algorithm.exer;

/**
 * ClassName:CalculateEigenvalue
 * Description:
 * 案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，并输出出来。
 * 要求：所有随机数都是两位数：[10,99]
 * 提示：求[a,b]范围内的随机数： (int)(Math.random() * (b - a + 1)) + a;
 *
 * @Author ZY
 * @Create 2023/4/11 15:08
 * @Version 1.0
 */
public class CalculateEigenvalue {
    public static void main(String[] args) {
        // 定义一维数组
        int[] arr = new int[10];
        //随机赋整数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
        }
        //计算数组的最大值、最小值、总和、平均值
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //输出整个数组元素
            System.out.print(arr[i] + "\t");
            //求最大值
            if (max <= arr[i]) {
                max = arr[i];
            }
            //求最小值
            if (min >= arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println();
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);
        System.out.println("数组的总和为:" + sum);
        System.out.println("数组的平均值为:" + (double)(sum / arr.length));
    }
}
