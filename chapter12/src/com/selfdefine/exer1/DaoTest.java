package com.selfdefine.exer1;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: DaoTest
 * Package: com.selfdefine.exer1
 * Description:
 *
 * @Create 2023/10/4 14:47
 */
public class DaoTest {
    @Test
    public void test1() {
        Dao<User> dao = new Dao<>();
        dao.save("1001",new User(1,20,"yujun"));
        dao.save("1002",new User(2,18,"haiyan"));


        System.out.println("----遍历list----");
        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }

        System.out.println();
        System.out.println("----遍历map----");
        dao.getMap();

        System.out.println();
        System.out.println("----打印id=1001的对象----");
        System.out.println(dao.get("1001"));

        System.out.println();
        System.out.println("----更改id=1001的对象----");
        dao.update("1001",new User(3,22,"yujun"));
        dao.getMap();

        System.out.println();
        System.out.println("----删除id=1001的对象----");
        dao.delete("1001");
        dao.getMap();



    }

}
