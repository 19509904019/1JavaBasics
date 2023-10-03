package com.selfdefine;

import org.junit.Test;

/**
 * ClassName: GenericTest
 * Package: com.selfdefine
 * Description:
 *
 * @Create 2023/10/3 20:48
 */
public class GenericTest{
    @Test
    public void test1(){
        // 实例化时，就可以指明类的泛型参数的类型
        Order order = new Order();
        Object obj = order.getT();
        // 泛型参数在指明时，是不可以使用基本数据类型的！但是可以使用包装类替代基本数据类型
        Order<Integer> order1 = new Order<>();
        Integer t = order1.getT();

        Order<String> order2 = new Order<>();
        order2.setT("AA");
    }
}
