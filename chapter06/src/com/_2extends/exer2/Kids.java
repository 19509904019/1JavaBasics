package com._2extends.exer2;

/**
 * ClassName:Kids
 * Description:
 *      成员变量int yearsOld;
 *      方法printAge()打印yearOld的值
 *
 * @Author ZY
 * @Create 2023/9/6 11:25
 * @Version 1.0
 */
public class Kids extends ManKind{
    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int gender,int salary,int yearsOld){
        this.yearsOld = yearsOld;
        setGender(gender);
        setSalary(salary);
    }


    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public int getYearsOld(){
        return yearsOld;
    }

    public void printAge(){
        System.out.println(yearsOld);
    }
}
