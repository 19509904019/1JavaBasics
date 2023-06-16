import java.util.Scanner;

/**
 * ClassName:GuLiAccount
 * Description:记账软件
 *
 * @Author ZY
 * @Create 2023/4/7 20:13
 * @Version 1.0
 */
public class GuLiAccount {
    public static void main(String[] args) {
        boolean isFalg = true;
        double money = 0;
        String info = "";
        //功能选择
        while (isFalg) {
            System.out.println("------------记账软件------------");
            System.out.println("\t" + "\t" + "\t" + "1.收支明细");
            System.out.println("\t" + "\t" + "\t" + "2.登记收入");
            System.out.println("\t" + "\t" + "\t" + "3.登记支出");
            System.out.println("\t" + "\t" + "\t" + "4.退出");
            System.out.print("\t" + "\t" + "\t" + "请选择(1-4):");
            //输入
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char input = str.charAt(0);
            switch (input) {
                case '1' -> {
                    System.out.println("-------当前收支明细记录-------");
                    System.out.println("收支" + "\t" + "\t" + "账户金额" + "\t" + "\t" + "收支金额" + "\t" + "\t" + "说明");
                    System.out.println(info);
                    System.out.println("---------------------------");
                }
                case '2' -> {
                    //输入收入金额
                    System.out.print("本次收入金额:");
                    int income = Utility.readNumber();
                    money += income;
                    //输入收入说明
                    System.out.print("本次收入说明:");
                    String explain = Utility.readString();
                    info += "收入" + "\t" + "\t" + money + "\t" + "\t" + income + "\t" + "\t" + "\t" + explain + "\n";
                }
                case '3' -> {
                    //输入支出金额
                    System.out.print("本次支出金额:");
                    int spend = Utility.readNumber();
                    if (money >= spend) {
                        money -= spend;
                        //输入收入说明
                        System.out.print("本次支出说明:");
                        String explain = Utility.readString();
                        info += "支出" + "\t" + "\t" + money + "\t" + "\t" + spend + "\t" + "\t" + "\t" + explain + "\n";
                    } else {
                        System.out.println("账户余额不足！");
                    }
                }
                case '4' -> {
                    System.out.print("确认是否退出(Y/N)?:");
                    char selection = Utility.readConfirmSelection();
                    if (selection == 'Y')
                        isFalg = false;
                    System.out.println("谢谢使用！");
                }
                default -> System.out.println("输入错误请重新输入！");
            }

        }

    }
}
