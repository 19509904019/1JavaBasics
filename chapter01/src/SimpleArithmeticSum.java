/**
 * ClassName:HelloWorld
 * Description:
 *
 * @Author ZY
 * @Create 2023/3/30 12:21
 * @Version 1.0
 */
//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArithmeticSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int target = scan.nextInt();

        System.out.println("目标数 " + target + " 的所有算数和为：");
        List<Integer> list = new ArrayList<>();
        calculateSum(list, target, 1);

        scan.close();
    }

    private static void calculateSum(List<Integer> list, int remaining, int start) {
        if (remaining == 0 && list.size() > 1) {
            StringBuffer sb = new StringBuffer();
            for (int num : list) {
                sb.append(num).append("+");
            }
            sb.deleteCharAt(sb.length() - 1); // 去除最后一个加号
            sb.append("=").append(list.stream().mapToInt(Integer::intValue).sum());
            System.out.println(sb); // 输出带结果的算式
        } else {
            for (int i = start; i <= remaining; i++) {
                list.add(i);
                calculateSum(list, remaining - i, i);
                list.remove(list.size() - 1);
            }
        }
    }
}





