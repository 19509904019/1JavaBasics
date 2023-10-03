package com.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Package: com.use.exer1
 * Description:
 *
 * @Create 2023/10/3 17:44
 */
public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet<Employee> treeSet = new TreeSet<>();
        Employee e1 = new Employee("Tom", 24, new MyDate(1999, 5, 20));
        Employee e2 = new Employee("Jack", 30, new MyDate(1983, 4, 27));
        Employee e3 = new Employee("yujun", 25, new MyDate(1998, 6, 3));
        Employee e4 = new Employee("haiyan", 30, new MyDate(1983, 4, 29));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);

        // 按照名字排序,使用自然排序
        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 方式1：直接使用定制排序
    @Test
    public void test() {
        // 定制排序，按照生日从大到小排序
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int yearInstance = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (yearInstance != 0) {
                    return yearInstance;
                }

                int monthInstance = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (monthInstance != 0) {
                    return monthInstance;
                }

                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        };

        // 使用定制排序，按照生日来进行排序
        TreeSet<Employee> treeSet = new TreeSet<>(comparator);

        Employee e1 = new Employee("Tom", 24, new MyDate(1999, 5, 20));
        Employee e2 = new Employee("Jack", 30, new MyDate(1983, 4, 27));
        Employee e3 = new Employee("yujun", 25, new MyDate(1998, 6, 3));
        Employee e4 = new Employee("haiyan", 30, new MyDate(1983, 4, 29));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);

        // 按照名字排序,使用自然排序
        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 方式2：先在MyDate中使用自然排序，再使用定制排序
    @Test
    public void test1() {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        };

        TreeSet<Employee> treeSet = new TreeSet<>(comparator);
        Employee e1 = new Employee("Tom", 24, new MyDate(1999, 5, 20));
        Employee e2 = new Employee("Jack", 30, new MyDate(1983, 4, 27));
        Employee e3 = new Employee("yujun", 25, new MyDate(1998, 6, 3));
        Employee e4 = new Employee("haiyan", 30, new MyDate(1983, 4, 29));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);

        // 按照名字排序,使用自然排序
        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
