import java.util.Scanner;

/**
 * ClassName:exer1
 * Description:
 * <p>
 * 利用面向对象的编程方法，计算圆的面积
 *
 * @Author ZY
 * @Create 2023/6/18 21:39
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        Exer1 exer = new Exer1();
        // 输入圆的半径
        Scanner scan = new Scanner(System.in);
        System.out.print("输入圆的半径：");
        double areas = scan.nextDouble();
        System.out.println("圆的面积为：" + exer.calculate(areas));

    }

    // 计算圆的面积
    public double calculate(double r) {
        return Math.PI * r * r;
    }
}
