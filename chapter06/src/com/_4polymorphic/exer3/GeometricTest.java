package com._4polymorphic.exer3;

/**
 * ClassName:GeometricTest
 * Description:
 *      编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型）
 *      编写displayGeometricObject方法显示对象的面积（注意方法的参数类型）
 * @Author ZY
 * @Create 2023/9/7 11:04
 * @Version 1.0
 */
public class GeometricTest {
    /**
     *  比较两个几何图形的面积是否相等
     * @param g1
     * @param g2
     * @return true：表示面积相等  false:面积不相等
     */
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }
    public void displayGeomtricObject(GeometricObject g){
        System.out.println("几何图形的面积为:" + g.findArea());
    }

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle circle1 = new Circle(2.3,"red",1);
        Circle circle2 = new Circle(3.3,"red",1);

        // 多态的应用
        test.displayGeomtricObject(circle1);
        test.displayGeomtricObject(circle2);

        System.out.println(test.equalsArea(circle1, circle2));
    }
}
