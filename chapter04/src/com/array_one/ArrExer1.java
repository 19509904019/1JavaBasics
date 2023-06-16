package com.array_one;

import java.util.Scanner;

/**
 * ClassName:ArrExer1
 * Description:
 * 案例：学生考试等级划分
 * <p>
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10    等级为’A’
 * 成绩>=最高分-20    等级为’B’
 * 成绩>=最高分-30    等级为’C’
 * 其余              等级为’D’
 * <p>
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩
 *
 * @Author ZY
 * @Create 2023/4/10 15:34
 * @Version 1.0
 */
public class ArrExer1 {
    public static void main(String[] args) {
        // 1.确定学生人数
        Scanner scan = new Scanner(System.in);
        System.out.print("输入学生人数:");
        int count = scan.nextInt();

        // 2.输入学生成绩并找出最高分
        System.out.println("输入每位学生的成绩:");
        double[] studentScore = new double[count];
        double maxScore = studentScore[0];
        for (int i = 0; i < studentScore.length; i++) {
            studentScore[i] = scan.nextDouble();
            if (maxScore < studentScore[i]) {
                maxScore = studentScore[i];
            }
        }
        System.out.println("最高分为:" + maxScore);

        //3.输出学生成绩等级
        char[] level = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < studentScore.length; i++) {
            for (int j = 10; j <= 40; j += 10) {
                if (studentScore[i] >= maxScore - j) {
                    System.out.println("成绩 " + studentScore[i] + " 等级为" + level[j / 10 - 1]);
                    break;
                }
            }
        }
    }
}
