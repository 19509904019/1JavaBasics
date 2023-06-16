import java.util.Scanner;

/**
 * ClassName:GuessNumber
 * Description:随机生成一个100以内的整数，猜这个随机数是多少
 *
 * @Author ZY
 * @Create 2023/3/30 13:48
 * @Version 1.0
 */
class GuessNumber {
    public static void main(String[] args) {
        //生成随机数
        int ran = (int) (Math.random() * 100) + 1;
        //进行循环
        while (true) {
            // 输入整数
            System.out.print("请输入一个100以内的整数:");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            //条件判断
            if (num <= 100 && num >= 1) {
                if (num < ran) {
                    System.out.println("猜的数小了！");
                } else if (num > ran) {
                    System.out.println("猜的数大了！");
                } else {
                    System.out.println("恭喜你，猜对了！！");
                    break;
                }
            } else {
                System.out.println("输入的数有误，请重新输入！");
            }
        }
    }
}

