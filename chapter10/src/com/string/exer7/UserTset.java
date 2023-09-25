package com.string.exer7;

import java.util.Scanner;

/**
 * ClassName:UserTset
 * Description:
 * 录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败
 * > 登录失败时，当用户名错误，提示没有该用户名
 * > 登录失败时，当密码错误时，提示密码错误
 *
 * @Author ZY
 * @Create 2023/9/25 16:03
 * @Version 1.0
 */
public class UserTset {
    public static void main(String[] args) {
        // 1. 创建数组，并初始化几个User对象
        User[] users = new User[3];
        users[0] = new User("aaaa", "1111");
        users[1] = new User("bbbb", "2222");
        users[2] = new User("cccc", "3333");
        System.out.println("库中的用户有：");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        // 2.录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = scan.next();
        System.out.print("请输入密码：");
        String password = scan.next();

        boolean isFlag = true;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getname().equals(name)) {
                if (users[i].getPassword().equals(password)) {
                    System.out.println("登录成功，" + users[i].getname());
                } else {
                    System.out.println("登录失败，密码错误！");
                }
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("登陆失败，账号错误！");
        }
        scan.close();
    }
}
