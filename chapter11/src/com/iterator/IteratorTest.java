package com.iterator;

import com.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName:IteratorTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/27 15:11
 * @Version 1.0
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection list = new ArrayList();

        // add
        list.add("aa");
        list.add("俞俊");
        list.add(128);  // 自动装箱
        list.add(new Person("俞俊", 18));
        list.add(new Object());

        // 获取迭代器对象
        Iterator iterator = list.iterator();
//        // 方式一
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(iterator.next());
//        }

        // 方式二：推荐
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Collection list = new ArrayList();

        // add
        list.add("aa");
        list.add("俞俊");
        list.add(128);  // 自动装箱
        list.add(new Person("俞俊", 18));
        list.add(new Object());

        // 方式三
        for (Object obj : list) {
            System.out.println(obj);
        }


        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : arr) {
            System.out.println(i);
        }
    }
    @Test
    public void test5(){
        int[] strArray = {1, 2, 3, 4};

        for (int i : strArray) {  // 在这个循环中，每次迭代都会创建一个新的i对象，并将当前元素的值赋给它。
            i = 5;
        }

        System.out.println(Arrays.toString(strArray));

    }
}
