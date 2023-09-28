package com.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ClassName:SetTest
 * Description: 要求：①参数List中只存放Integer的对象
 * ②在List内去除重复数字值，尽量简单
 *
 * @Author ZY
 * @Create 2023/9/28 15:56
 * @Version 1.0
 */
public class SetTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);

        List newList = duplicateList(list);
        for(Object obj: newList){
            System.out.println(obj);
        }

    }


    public static List duplicateList(List list) {
//        HashSet hashSet = new HashSet();
//
//        for(Object obj : list){
//            hashSet.add(obj);
//        }
//
//        ArrayList list1 = new ArrayList();
//        for(Object obj : hashSet){
//            list1.add(obj);
//        }
//
//        return list1;

        Set set = new HashSet(list);
        List list1 = new ArrayList(set);
        return list1;
    }
}
