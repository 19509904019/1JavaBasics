package com.common_algorithm.exer;

import java.util.Scanner;

/**
 * ClassName:ReturnNumber
 * Description:回形数
 * 1	2	3	4
 * 12	13	14	5
 * 11	16	15	6
 * 10	9	8	7
 *
 * @Author ZY
 * @Create 2023/4/11 21:08
 * @Version 1.0
 */
public class ReturnNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个数字:");
        int len = scanner.nextInt();
        int[][] arr = new int[len][len];
        //数组总位数
        int s = len * len;
        /*
         * k = 1:向右
         * k = 2:向下
         * k = 3:向左
         * k = 4:向上
         */
        int k = 1;
        int i = 0, j = 0;
        for (int n = 1; n <= s; n++) {
            //向右赋值再向下
            if (k == 1) {
                if (j < len && arr[i][j] == 0) {
                    arr[i][j++] = n;
                } else {
                    k = 2;
                    j--;
                    i++;
                }
            }
            //向下赋值再向左
            if (k == 2) {
                if (i < len && arr[i][j] == 0) {
                    arr[i++][j] = n;
                } else {
                    k = 3;
                    i--;
                    j--;
                }
            }
            //向左赋值再向上
            if (k == 3) {
                if (j >= 0 && arr[i][j] == 0) {
                    arr[i][j--] = n;
                } else {
                    k = 4;
                    j++;
                    i--;
                }
            }
            //向上赋值再向右
            if (k == 4) {
                if (i >= 0 && arr[i][j] == 0) {
                    arr[i--][j] = n;
                } else {
                    k = 1;
                    n--;
                    i++;
                    j++;
                }
            }
        }

        //遍历生成的数组
        for (int n = 0; n < arr.length; n++) {
            for (int m = 0; m < arr[n].length; m++) {
                System.out.print(arr[n][m] + "\t");
            }
            System.out.println();
        }
    }
}

