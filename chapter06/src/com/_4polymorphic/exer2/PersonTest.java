package com._4polymorphic.exer2;

/**
 * ClassName:PersonTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/7 10:11
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Man();

        //不能直接调用子类特有的结构
        //person.play();

        // 向下转型:适用强转符
        Man m1 = (Man) person;
        m1.play();

        /*
          向下转型可能会出现：类型转换异常（ClassCastException）
         */
        Person person1 = new Woman();
//        Man m2 = (Man) person1;

        /*
         * 1. 建议在向下转型之前，适用instanceof进行判断，避免出现类型转换异常
         * 2. 格式 a instanceOf A: 判断对象a是否是类A的实例
         * 3. 如果a instanceOf A 返回true，则：
         *       a instanceOf superA 返回也是true。其中，A 是superA的子类
         **/
        if (person1 instanceof Man) {
            Man m2 = (Man) person1;
            m2.play();
        }

        if (person1 instanceof Woman) {
            System.out.println("woman");
        }

    }
}
