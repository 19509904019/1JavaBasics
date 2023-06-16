/**
 * ClassName:PrintRhombus
 * Description:打印如下菱形
 * *
 * * * *
 * * * * * *
 * * * * * * * *
 * * * * * * * * * *
 * * * * * * * *
 * * * * * *
 * * * *
 * *
 *
 * @Author ZY
 * @Create 2023/3/30 13:10
 * @Version 1.0
 */
public class PrintRhombus {
    public static void main(String[] args) {
        //打印菱形的上半部分
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //打印菱形的下半部分
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 9 - 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
