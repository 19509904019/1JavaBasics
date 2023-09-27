package com.list.exer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

/**
 * ClassName: GetCount
 * Package: com.list.exer2
 * Description:
 * 统计集合中指定元素出现的次数
 * (1) 创建集合，集合存放随机生成的30个小写字母
 * (2) 用listTest统计，a、b、c、x元素的出现次数
 *
 * @Create 2023/9/28 0:04
 */
public class GetCount {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        GetCount getCount = new GetCount();
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 30; i++) {
            // 将字符包装成类对象
            String temp = String.valueOf(str.charAt(new Random().nextInt(str.length())));
            list.add(temp);
        }

        System.out.println(list);

        System.out.println("a:" + listTest(list,"a"));
        System.out.println("b:" + listTest(list,"b"));
        System.out.println("c:" + listTest(list,"c"));
        System.out.println("x:" + listTest(list,"x"));
    }


    public static int listTest(Collection coll,String s) {
        int count = 0;
        for(Object o : coll){
            if(o.equals(s)){
                count++;
            }
        }
        return count;
    }


}
