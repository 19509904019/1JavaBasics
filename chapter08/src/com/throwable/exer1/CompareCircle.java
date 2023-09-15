package com.throwable.exer1;

/**
 * ClassName:CompareCicle
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/15 16:09
 * @Version 1.0
 */
public class CompareCircle extends Circle implements CompareObject{
    public CompareCircle() {
    }

    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) throws Exception{
        if (this == o) {
            return 0;
        }

        if (o instanceof CompareCircle compareCircle) {
            return Double.compare(this.getRadius(), compareCircle.getRadius());
        } else {
//            throw new RuntimeException("输入类型不匹配");
            throw new Exception("输入类型不匹配");
        }
    }
}
