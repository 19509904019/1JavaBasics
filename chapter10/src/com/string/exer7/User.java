package com.string.exer7;

/**
 * ClassName:User
 * Description:
 * 提供属性为用户名和密码，提供相关的getter和setter方法，构造器，toString()
 *
 * @Author ZY
 * @Create 2023/9/25 16:05
 * @Version 1.0
 */
public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name + "--" + password;
    }
}
