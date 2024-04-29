package com.list;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:ListTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/27 16:23
 * @Version 1.0
 */
public class ListTest {
    @Test
    public void test1() {
        List list = new ArrayList();

        list.add("yujun");
        list.add("haiyan");
        list.add(123);

        System.out.println(list);

        // add(int index, Object ele)
        list.add(1,110);
        System.out.println(list);

        // addAll(int index, Collection eles)
        List integers = Arrays.asList(1, 2, 3);

        list.addAll(1,integers);  //[yujun, 1, 2, 3, 110, haiyan, 123]
        list.add(1,integers);  //[yujun, [1, 2, 3], 110, haiyan, 123]
    }

    @Test
    public void test2(){
        List list = new ArrayList();

        list.add("yujun");
        list.add("haiyan");
        list.add(123);
        list.add(2);

        list.remove(2);  // 删除索引为2的数据

        list.remove(Integer.valueOf(2)); // 删除对象为2的数据,因为传入的是类对象

    }
}
