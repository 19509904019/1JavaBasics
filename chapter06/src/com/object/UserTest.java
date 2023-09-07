package com.object;

import java.util.Objects;

/**
 * ClassName:UserTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/7 15:02
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("yujun", 18);
        User u2 = new User("yujun", 18);

        System.out.println(u1.equals(u2));  // false，比较的是两个对象。重写equals方法后为true

        String str1 = new String("123");
        String str2 = new String("123");


        System.out.println(str1.equals(str2));  // true  String将equals方法进行了重写，此时对比的是内容
        System.out.println(str1 == str2);  //false  此时对比的是两个对象的地址

    }
}


class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写equals
//    public boolean equals(Object obj) {
//        // 同一个对象
//        if (this == obj) {
//            return true;
//        }
//
//        // 判断是否为User
//        if (obj instanceof User) {
//            User user = (User) obj;  // 将obj向下转换成user
//           return this.age == user.age && this.name.equals(user.name);
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}