package com._2extends.exer2;

/**
 * ClassName:MainKind
 * Description:
 * 定义一个ManKind类，包括
 * ①成员变量int gender和 int salary
 * 方法void manOrWoman():根据age的值显示"man"(gender == 1)或"woman"(gender == 0)
 * <p>
 * 方法void employed():根据salary的值显示"no job(salary == 0)"或"job(salary != 0)"
 *
 * @Author ZY
 * @Create 2023/9/6 11:15
 * @Version 1.0
 */
public class ManKind {
    private int gender;
    private int salary;

    public ManKind(int gender, int salary) {
        this.gender = gender;
        this.salary = salary;
    }

    public ManKind() {
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman() {
        if (gender == 1) {
            System.out.println("man");
        } else if (gender == 0) {
            System.out.println("woman");
        }
    }

    public void employed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }

}
