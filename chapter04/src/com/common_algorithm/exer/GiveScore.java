package com.common_algorithm.exer;

/**
 * ClassName:GiveScore
 * Description:
 * 案例：评委打分
 * 分析以下需求，并用代码实现：
 * （1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5,4,6,8,9,0,1,2,7,3
 * （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
 *
 * @Author ZY
 * @Create 2023/4/11 15:36
 * @Version 1.0
 */
public class GiveScore {
    public static void main(String[] args) {
        // 定义一维数组
        int[] arr = new int[10];
        //生成评分
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
        }
        //去掉最高分和最低分
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int average;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            //最大值
            if (max <= arr[i]) {
                max = arr[i];
            }
            //最小值
            if (min >= arr[i]) {
                min = arr[i];
            }
            //计算总和
            sum += arr[i];
        }
        average = (sum - max - min) / (arr.length - 2);
        System.out.println();
        System.out.println("平均分为:" + average);
    }
}
