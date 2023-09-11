package com._interface.exer3;

/**
 * ClassName:ComparableCircle
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/11 10:36
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof ComparableCircle) {
            ComparableCircle comparableCircle = (ComparableCircle) o;

            // 写法1
//            if(this.getRadius() > comparableCircle.getRadius()){
//                return 1;
//            }else if(this.getRadius() < comparableCircle.getRadius()){
//                return -1;
//            }else {
//                return 0;
//            }

            //写法2
            return Double.compare(this.getRadius(), comparableCircle.getRadius());
        } else {
            return 2;
            // throw new RuntimeException("输入的类型不匹配");
        }


    }
}
