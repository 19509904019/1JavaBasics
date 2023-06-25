package com.recusion;

/**
 * ClassName:com.recusion.RecusionExer
 * Description:
 *
 * @Author ZY
 * @Create 2023/6/20 15:50
 * @Version 1.0
 */
public class RecusionExer {
    // 已知一个数列：f(20) = 1, f(21) = 4, f(n + 2) = 2 * f(n + 1)+f(n)
    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }

    public static void main(String[] args) {
        RecusionExer exer1 = new RecusionExer();
        int result1 = exer1.f(10);
        System.out.println(result1);
    }
}
