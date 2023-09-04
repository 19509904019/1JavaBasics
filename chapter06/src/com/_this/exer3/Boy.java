package com._this.exer3;

/**
 * ClassName:Boy
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/4 9:09
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public Boy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我也想娶"+girl.getName());
    }

    public void shout(){
        if(age >= 22){
            System.out.println("达到法定年龄");
        }else {
            System.out.println("未达到法定年龄");
        }
    }
}
