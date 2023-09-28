package com.set.exer2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName:SetTest1
 * Description:
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数
 * 输出到控制台
 *
 * @Author ZY
 * @Create 2023/9/28 16:23
 * @Version 1.0
 */
public class SetTest1 {
    public static void main(String[] args) {
        Set set = new HashSet();

        while (set.size() < 10) {
            set.add((int) (Math.random() * 20) + 1);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
