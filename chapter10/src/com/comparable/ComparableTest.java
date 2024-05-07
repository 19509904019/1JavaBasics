package com.comparable;

import com.comparable.exer1.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName:ComparableTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/26 16:11
 * @Version 1.0
 */
public class ComparableTest {
    @Test
    public void test1() {
        String[] arr = {"Tom", "Jerry", "Tony", "Rose", "Jack", "Lucy"};

        Arrays.sort(arr);
        for (String s : arr) {
            System.out.print(s + "\t");
        }

        Comparator<Object> comparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String str1 &&
                        o2 instanceof String str2) {

                    return -CharSequence.compare(str1, str2);
                }

                throw new RuntimeException("类型匹配失败");
            }
        };

        System.out.println();
        Arrays.sort(arr,comparator);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    @Test
    public void test2() {
        Product[] arr = new Product[5];
        arr[0] = new Product("xiaomi", 5999);
        arr[1] = new Product("huawei", 6999);
        arr[2] = new Product("apple", 5999);
        arr[3] = new Product("oppo", 3999);
        arr[4] = new Product("vivo", 2999);

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
