package com.use;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionMapTest
 * Package: com.use
 * Description:
 *
 * @Create 2023/10/3 12:16
 */
public class CollectionMapTest {

    //体会集合中使用泛型前的场景
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(67);
        list.add(85);
        list.add(73);
        list.add(90);
        list.add(58);

        //问题1：类型不安全，因为add()的参数是Object类型，意味着任何类型的对象都可以添加成功
//        list.add("AA");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            //问题2：需要使用强转操作，繁琐。还有可能导致ClassCastException异常
            int score = (Integer) iterator.next();
            System.out.println(score);
        }
    }

    // 在集合中使用泛型的例子
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(52);
        list.add(78);
//        list.add("AA");  // 编译出错
    }

    /*
    * 泛型在Map中的应用
    * */
    @Test
    public void test3(){
        // HashMap<String, Integer> map = new HashMap<String, Integer>();

        //jdk7新特性
        HashMap<String, Integer> map = new HashMap<>(); // 类型推断
        map.put("Tom",85);
        map.put("yujun",99);
        map.put("haiyan",90);
        map.put("Jack",74);

//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        var entrySet = map.entrySet();
        var iterator = entrySet.iterator();
        while(iterator.hasNext()){
//            Map.Entry<String, Integer> entry = iterator.next();
            var entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "---->" + value);
        }
    }
}
