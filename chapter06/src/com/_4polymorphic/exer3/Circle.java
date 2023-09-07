package com._4polymorphic.exer3;

/**
 * ClassName:Circle
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/7 10:54
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }
}
