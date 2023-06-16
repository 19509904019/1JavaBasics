import java.util.Scanner;

/**
 * ClassName:MultiplesAndDivisor
 * Description:键盘输入两个数，打印两个数的最大公约数和最小公倍数
 *
 * @Author ZY
 * @Create 2023/3/30 12:44
 * @Version 1.0
 */
public class MultiplesAndDivisor {
    public static void main(String[] args) {
        //输入两个整数
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int num1 = scan.nextInt();
        System.out.print("请输入第二个数：");
        int num2 = scan.nextInt();

        // 计算最大公约数
        int min = Math.min(num1, num2);
        for(int i = min; i >= 1;i--){
            if(num1 % i ==0 && num2 % i == 0){
                System.out.println("最大公约数为：" + i);
                break;
            }
        }

        //计算最小公倍数
        int max = Math.max(num1,num2);
        for(int j = max;j <= num2 * num1; j += max){
            if(j % num1 == 0 && j % num2 == 0){
                System.out.println("最小公倍数为：" + j);
                break;
            }
        }

    }
}
