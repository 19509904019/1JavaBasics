package com.map;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: TreeMapTest
 * Package: com.map
 * Description:
 *
 * @Create 2023/10/1 17:47
 */
public class TreeMapTest {
    @Test
    public void test1() {
        TreeMap map = new TreeMap();
        map.put("AA", 1230);
        map.put("BB", "俞俊");
        map.put("CC", new String("133"));

        Set set = map.keySet();
        for (Object key : set) {
            System.out.println(key + "----->" + map.get(key));
        }
    }

    @Test
    public void test2() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product) {
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    int value = p1.getName().compareTo(p2.getName());
                    if (value != 0) {
                        return value;
                    }

                    return (int) (p1.getPrice() - p2.getPrice());
                }

                throw new RuntimeException("类型不匹配");
            }
        };

        TreeMap map = new TreeMap();

        map.put(new Product("俞俊", 22), 45);
        map.put(new Product("海燕", 20), 23);
        map.put(new Product("Tom", 45), 19);
        map.put(new Product("Tom", 35), 19);

        Set entrySet = map.entrySet();  // Set存储键值对
        for (Object entry : entrySet) {
            System.out.println(entry);
        }
    }
}
