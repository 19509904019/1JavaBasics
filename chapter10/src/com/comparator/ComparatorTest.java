package com.comparator;

import com.comparable.exer1.Product;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName:ComparatorTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/26 17:09
 * @Version 1.0
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Product[] arr = new Product[5];
        arr[0] = new Product("xiaomi", 5999);
        arr[1] = new Product("huawei", 6999);
        arr[2] = new Product("apple", 5999);
        arr[3] = new Product("oppo", 3999);
        arr[4] = new Product("vivo", 2999);

        // 创建一个实现了comparator接口的而实现类的对象
        Comparator comparator = new Comparator() {
            // 如何判断两个对象o1,o2的大小，其标准就是此方法的方法体要编写的逻辑
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product p1 && o2 instanceof Product p2) {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                }

                throw new RuntimeException("类型不匹配");
            }
        };

        Arrays.sort(arr, comparator);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
