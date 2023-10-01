package com.collections;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionsTest
 * Package: com.collections
 * Description:常用方法
 *
 * @Create 2023/10/2 0:37
 */
public class CollectionsTest {
    @Test
    public void test1() {
        List list = Arrays.asList(15, 52, 45, 23, 14, 86, 92, 87, 26);

//        // reverse(List)
//        Collections.reverse(list);
//        System.out.println(list);

        //shuffle(List)
//        Collections.shuffle(list);
//        System.out.println(list);

        // sort(List)
//        Collections.sort(list);
//        System.out.println(list);

        // sort(List, Comparator):降序输出
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;

                    return i2 - i1;

                }
                throw new RuntimeException("类型不匹配");
            }
        };
        Collections.sort(list, comparator);
        System.out.println(list);

        // swap(List, int, int):交换索引所对元素的位置
        Collections.swap(list, 1, 2);
        System.out.println(list);
    }

    @Test
    public void test2() {
        List list = Arrays.asList(15, 52, 45, 23, 14, 86, 92, 87, 26, 15, 52, 15);

        // max()
        System.out.println(Collections.max(list));

        // frequency()
        System.out.println(Collections.frequency(list, 15));

        //copy()
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest, list);
        System.out.println(dest);
    }

    @Test
    public void test3() {
        List list = Arrays.asList(15, 52, 45, 23, 14, 86, 92, 87, 26, 15, 52, 15);

        // replace(List list, oldValue, newValue)
        Collections.replaceAll(list, 15, 16);
        System.out.println(list);
    }

    @Test
    public void test4() {
        List list1 = new ArrayList();
        list1.add(34);
        list1.add(18);
        list1.add(25);

        List list2 = Collections.unmodifiableList(list1);
//        list2.add(20);  // 只能读不能写
        System.out.println(list2.get(0));

        // addAll(List, ...elements)
        Collections.addAll(list1, 15, 48, 55, 60);
        System.out.println(list1);
    }
}
