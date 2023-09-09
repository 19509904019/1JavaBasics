package com.block.exer;

import java.util.Date;

/**
 * ClassName: User
 * Package: com.block.exer
 * Description:
 * 包含属性：userName(String类型)、password(String类型)、registrationTime(long类型)、私有化
 * 包含get/set方法，其中registrationTime没有set方法
 * 包含无参构造：
 * - 输出“新用户注册”
 * - registrationTime赋值为当前系统时间
 * - userName就默认为当前系统时间值
 * - password默认为“123456”
 * <p>
 * 包含有参构造器（String userName, String password）
 * - 输出“新用户注册”
 * - registrationTime赋值为当前系统时间
 * <p>
 * 包含public String getInfo()方法，返回：“用户名：xx, 密码：xx, 注册时间：xx”
 *
 * @Create 2023/9/9 16:17
 */
public class User {

    private String userName;
    private String password;
    private long registrationTime;

    public User() {
        System.out.println("----------新用户注册----------");
        registrationTime = System.currentTimeMillis(); // 获取当前系统时间
        userName = System.currentTimeMillis() + "";
        password = "123456";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

        System.out.println("----------新用户注册----------");
        registrationTime = System.currentTimeMillis();
    }

    public long getRegistrationTime() {

        return registrationTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return "用户名：" + userName + "  密码：" + password + "  注册时间：" + registrationTime;
    }
}
