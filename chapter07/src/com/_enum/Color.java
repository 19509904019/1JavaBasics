package com._enum;

/**
 * ClassName:Color
 * Description:
 * - 声明final修饰的int类型的属性red、green、blue
 * - 声明final修饰的String类型的属性description
 * - 声明有参构造器Color(int red, int green, int blue, String description)
 * - 创建7个常量对象：红橙黄绿青蓝紫
 * -重写toString方法：例如RED(255,0,0)  --> 红色
 *
 * @Author ZY
 * @Create 2023/9/13 11:02
 * @Version 1.0
 */
public enum Color {
    RED(255, 0, 0,"红色"),
    ORANGE(255, 128, 0,"橙色"),
    YELLOW(255, 255, 0,"黄色"),
    GREEN(0, 255, 0,"绿色"),
    CYAN(0, 255, 255,"青色"),
    BLUE(0, 0, 255,"蓝色"),
    PURPLE(128, 0, 255,"紫色");


    // 属性
    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    // 提供get方法
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    // 提供构造器，private可以省略
    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }


    @Override
    public String toString() {
        return name() + "(" + red + "," + green + "," + blue + ") ---> " + description;
    }
}
