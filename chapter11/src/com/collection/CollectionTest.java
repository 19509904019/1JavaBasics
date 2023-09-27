package com.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ClassName:com.collection.CollectionTest
 * Description:
 * 测试Collection中方法的使用
 *
 * @Author ZY
 * @Create 2023/9/27 10:59
 * @Version 1.0
 */
public class CollectionTest {
    @Test
    public void test1() {
        Collection list = new ArrayList();

        // add
        list.add("aa");
        list.add("俞俊");
        list.add(128);  // 自动装箱
        list.add(new Person("俞俊", 18));
        list.add(new Object());

        System.out.println(list); //[aa, 俞俊, 128, Person{name='俞俊', age=18}, java.lang.Object@7bb11784]

        // addAll(Collection other)
        Collection list2 = new ArrayList();
        list2.add("BB");
        list2.add(456);
        list.addAll(list2);
        System.out.println(list);  //[aa, 俞俊, 128, Person{name='俞俊', age=18}, java.lang.Object@7bb11784, BB, 456]

        //size()
        System.out.println(list.size());  // 7

        //isEmpty()
        System.out.println(list.isEmpty());  //false

        // contains(Object obj)
        System.out.println(list.contains("AA"));  //true
        System.out.println(list.contains(128));  //true
        System.out.println(list.contains(new Person("俞俊", 18))); //不重写equals为false，重写为true

        //containsAll(Collection list): 一个列表是否包含另一个列表所有元素
        Collection list3 = new ArrayList();
        list3.add("aa");
        list3.add(128);
//        list3.add(123);

        System.out.println(list.containsAll(list3));
    }

    @Test
    public void test2() {
        Collection list = new ArrayList();

        // add
        list.add("aa");
        list.add("俞俊");
        list.add(new Person("俞俊", 18));
        list.add(128);
        list.add(new Object());

//        //clear()
//        list.clear();
//        System.out.println(list);  // []
//        System.out.println(list.size());  // 0

        // remove(Object obj): 删除第一个找到的元素
        list.remove(new Person("俞俊", 18));  // 删除的时候进行一一对比
        System.out.println(list);

        // removeAll(Collection coll):删除所有相同的元素 ---> 差集
        // retainAll(Collection coll):删除集合中不同的元素 ---> 交集
    }

    /**
     * Object[] toArray():返回包含当前集合中所有元素的数组
     * hashCode():获取集合对象的哈希值
     * iterator():返回迭代器对象，用于集合遍历
     */
    @Test
    public void test3() {
        Collection list = new ArrayList();

        // add
        list.add("aa");
        list.add("俞俊");
        list.add(128);
        list.add(new Person("俞俊", 18));
        list.add(new Object());

        // 集合 ---> 数组
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        //hashCode()
        System.out.println(list.hashCode());


    }
}
