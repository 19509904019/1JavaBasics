package com.selfdefine.exer1;

import java.util.*;

/**
 * ClassName: Dao
 * Package: com.selfdefine.exer1
 * Description:
 *
 * @Create 2023/10/4 14:33
 */
public class Dao<T> {
    Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {  // 保存T类型的对象到Map成员变量中
        if (!map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public T get(String id) { //从map中获取id对应的对象
        return map.get(id);
    }

    public void update(String id, T entity) {  // 替换map中key为id的内容，改为entity对象
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public List<T> list() {  // 返回map中存放的所有T对象
        Set<String> keySet = map.keySet();
        ArrayList<T> list = new ArrayList<>();
        for (var s : keySet) {
            list.add(map.get(s));
        }
        return list;
    }

    public void delete(String id) {  // 删除指定id对象
        map.remove(id);
    }

    public void getMap() {
        var entrySet = map.entrySet();
        for (var s : entrySet) {
            System.out.println(s.getKey() + "--->" + s.getValue());
        }
    }
}
