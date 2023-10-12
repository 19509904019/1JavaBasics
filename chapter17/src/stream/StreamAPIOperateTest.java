package stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName:StreamAPIOperateTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/12 14:41
 * @Version 1.0
 */
public class StreamAPIOperateTest {
    // 筛选与切片
    @Test
    public void test1() {
        // 查询员工表中薪资大于7000的员工信息:filter(Predicate p)
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        list.forEach(System.out::println);
        System.out.println("****************");
        stream.filter(emp -> emp.getSalary() > 7000).forEach(System.out::println);

        System.out.println("****************");

        // limit(n) —— 截断流，使其元素不超过给定数量
        /*
         * 错误的写法，因为stream已经执行了终止操作，就不可以再调用其他的中间操作或终止操作了
         * */
//        stream.limit(2).forEach(System.out::println);

        list.stream().limit(2).forEach(System.out::println);

        System.out.println("****************");

        // skip(n):跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流
        list.stream().filter(emp -> emp.getSalary() > 7000).skip(2).forEach(System.out::println);

        System.out.println("****************");

        // distinct() —— 筛选，去重
        list.stream().distinct().forEach(System.out::println);

    }

    // 2.映射
    @Test
    public void test2() {
        // map(Function f):接收一个函数作为参数，将元素转换成其他形式或提取信息

        /*
         * 转换为大写
         * */
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
        Stream<String> stream = list.stream();
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        /*
         * 获取员工姓名长度大于3的员工
         * */
        List<Employee> list1 = EmployeeData.getEmployees();
        Stream<Employee> stream1 = list1.stream();
        stream1.filter(emp -> emp.getName().length() > 3).forEach(System.out::println);

        /*
         * 获取员工姓名长度大于3的员工的姓名
         * */
        list1.stream().map(Employee::getName).filter(name -> name.length() > 3).forEach(System.out::println);

    }

    // 3.排序
    @Test
    public void test3() {
        Integer[] arr = new Integer[]{45, 12, 85, 65, 35, 96, 19, 29, 37};
        String[] arr1 = new String[]{"AA", "CC", "BB", "EH", "FP", "tG"};

        Arrays.stream(arr).sorted().forEachOrdered(num -> System.out.print(num + "\t"));
        System.out.println();
        Arrays.stream(arr1).sorted().forEachOrdered(str -> System.out.print(str + "\t"));
        System.out.println();
        System.out.println(Arrays.toString(arr));

        // sorted(Comparator com) —— 定制排序
        List<Employee> list = EmployeeData.getEmployees();
        list.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).forEach(System.out::println);
        list.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

        // 针对于字符串从大到小排序
        Arrays.stream(arr1).sorted((s1, s2) -> s1.compareTo(s2)).forEach(str -> System.out.print(str + "\t"));  // 升序
        System.out.println();
        Arrays.stream(arr1).sorted(String::compareTo).forEach(str -> System.out.print(str + "\t"));  // 升序
        System.out.println();
        Arrays.stream(arr1).sorted((s1, s2) -> -s1.compareTo(s2)).forEach(str -> System.out.print(str + "\t"));  // 降序
    }

    // 匹配查找
    @Test
    public void test4() {
        // 是否所有员工的年龄都大于18
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        // allMatch():检查是否匹配所有元素
        System.out.println(stream.allMatch(emp -> emp.getAge() > 18));  //false

        // anyMatch():检查是否匹配至少一个元素
        // 是否存在员工的年龄大于18
        boolean b = list.stream().anyMatch(employee -> employee.getAge() > 18);
        System.out.println(b); //true

        // 是否存在员工的工资大于1000
        boolean b1 = list.stream().anyMatch(employee -> employee.getSalary() > 1000);
        System.out.println(b1); //true

        // findFirst():返回第一个元素
        Optional<Employee> first = list.stream().findFirst();
        System.out.println(first);
    }

    @Test
    public void test5() {
        List<Employee> list = EmployeeData.getEmployees();

        // count():返回流中元素的总个数
        System.out.println(list.stream().count());

        // max():返回流中最大值
        /*
         * 返回最高的工资的员工及工资
         * */
        Optional<Employee> maxSalary = list.stream().max(Comparator.comparingDouble((Employee::getSalary)));
        System.out.println(maxSalary.get());
        Optional<Double> max = list.stream().map(Employee::getSalary).max(Double::compare);
        System.out.println(max.get());

        // min():返回流中最小值
        /*
         * 返回最低的工资员工和最低工资
         * */
        Optional<Employee> minSalary = list.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(minSalary.get());
        Optional<Double> min = list.stream().map(Employee::getSalary).min(Double::compare);
        System.out.println(min.get());
    }


    // 4.归约
    @Test
    public void test6() {
        // reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值，返回T
        /*
         * 计算1-10的自然数的和
         * */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++)
            list.add(i);

        Integer reduce = list.stream().reduce(0, (x1, x2) -> x1 + x2);
        Integer reduce1 = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        System.out.println(reduce1);

        // reduce(BinaryOperator)——可以将流中元素反复结合起来，得到一个值，返回Optional<T>
        /*
         * 计算公司所有员工工资的总和
         * */
        List<Employee> list1 = EmployeeData.getEmployees();
        Optional<Double> reduce2 = list1.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(reduce2.get());
    }

    // 5.收集
    @Test
    public void test7() {
        // collect(Collection c):将流转换为其他形式。接收一个Collection接口的实现，用于给Stream中元素做汇总的方法
        /*
         * 查找工资大于6000的员工，结果返回一个List或Set
         * */
        List<Employee> list = EmployeeData.getEmployees();
        List<Employee> listSalary = list.stream()
                                        .filter(employee -> employee.getSalary() > 6000)
                                        .collect(Collectors.toList());
        Set<Employee> setSalary = list.stream()
                                      .filter(employee -> employee.getSalary() > 6000)
                                      .collect(Collectors.toSet());
        System.out.println(listSalary);
        System.out.println(setSalary);

        /*
        * 按照员工的年龄进行排序，返回到一个新的list中
        * */
        List<Employee> collect = list.stream()
                                     .sorted(Comparator.comparingInt(Employee::getAge))
                                     .collect(Collectors.toList());
        List<Employee> collect1 = list.stream()
                                     .sorted((emp1,emp2)->Integer.compare(emp1.getAge(), emp2.getAge()))
                                     .toList();
        collect.forEach(System.out::println);
        System.out.println();
        collect1.forEach(System.out::println);


    }
}
