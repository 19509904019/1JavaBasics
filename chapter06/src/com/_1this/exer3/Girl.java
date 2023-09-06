package com._1this.exer3;

/**
 * ClassName:Girl
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/4 9:16
 * @Version 1.0
 */
public class Girl {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);  // 用this调用当前对象
    }


    /**
     * 比较两个Girl对象的大小
     * @param girl
     * @return 正数：当前对象大； 负数：当前对象小（或形参girl大）；0：相等
     */

    public int compare(Girl girl){
        if(this.age > girl.age){
            return 1;
        }else if(this.age < girl.age){
            return -1;
        }else {
            return 0;
        }
    }
}
