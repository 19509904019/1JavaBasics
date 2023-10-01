package com.map.exer1;

import java.util.*;

/**
 * ClassName: SingerTest
 * Package: com.map.exer1
 * Description:
 * 添加歌手及其歌名，并遍历
 *
 * @Create 2023/10/1 19:05
 */
public class SingerTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        // 添加一个歌手和其歌曲
        String singer1 = "周杰伦";
        ArrayList list1 = new ArrayList();
        list1.add("稻香");
        list1.add("屋顶");
        list1.add("晴天");
        list1.add("夜曲");
        list1.add("发如雪");
        list1.add("千里之外");
        map.put(singer1, list1);

        // 再添加一个歌手和其歌曲
        String singer2 = "林俊杰";
        ArrayList list2 = new ArrayList();
        list2.add("背对背拥抱");
        list2.add("江南");
        list2.add("不潮不用花钱");
        list2.add("曹操");
        list2.add("小酒窝");
        map.put(singer2, list2);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("歌手：" + entry.getKey());
            System.out.println("歌曲有：" + entry.getValue());
        }
    }
}
