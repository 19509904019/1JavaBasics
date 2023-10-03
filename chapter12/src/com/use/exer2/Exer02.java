package com.use.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: Exer02
 * Package: com.use.exer2
 * Description:
 * (1) 创建一个ArrayList集合对象，并指定泛型为<Integer>
 * (2) 添加5个[0,100)以内的随机整数到集合中
 * (3) 使用foreach遍历输出5个整数
 * (4) 使用集合removeIf方法删除偶数，为Predicate接口指定泛型<Integer>
 * (5) 再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
 *
 * @Create 2023/10/3 17:24
 */
public class Exer02 {
    public static void main(String[] args) {
        // (1) 创建一个ArrayList集合对象，并指定泛型为<Integer>
        ArrayList<Integer> list = new ArrayList<>();

        // (2) 添加5个[0,100)以内的随机整数到集合中
        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random() * 101));
        }

        // (3) 使用foreach遍历输出5个整数
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }
        System.out.println();

        // (4) 使用集合removeIf方法删除偶数，为Predicate接口指定泛型<Integer>
//        list.removeIf(new Predicate<Integer>() {
//
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        });

        list.removeIf(e -> (e % 2 == 0));

        // (5) 再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
