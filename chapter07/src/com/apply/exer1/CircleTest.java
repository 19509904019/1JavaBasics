package com.apply.exer1;

/**
 * ClassName:Circle
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/8 10:41
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle(3);
        System.out.println(c3);

        System.out.println(Circle.total);

    }
}

class Circle {
    private double radius;  // 实例变量
    private final int id; // 实例变量
    static int total; // 创建的Circle实例的个数
    private static int init = 1001;  // 自动给id赋值的基数

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }
}
