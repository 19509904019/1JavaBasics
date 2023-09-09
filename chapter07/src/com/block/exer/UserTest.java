package com.block.exer;

import java.util.Date;

/**
 * ClassName: UserTest
 * Package: com.block.exer
 * Description:
 *
 * @Create 2023/9/9 16:54
 */
public class UserTest {
    public static void main(String[] args) {
        // 没有使用代码块
        User user1 = new User();
        System.out.println(user1.getInfo());

        // 使用了代码块
        User1 user11 = new User1();
        System.out.println(user11.getInfo());
    }
}
