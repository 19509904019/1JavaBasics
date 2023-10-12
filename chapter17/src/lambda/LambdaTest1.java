package lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * ClassName:lambda.LambdaTest1
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/11 20:44
 * @Version 1.0
 */
public class LambdaTest1 {
    @Test
    public void test1() {
        // 语法格式一：无参，无返回值
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable()...");
            }
        };
        r1.run();

        System.out.println("***********************");

        Runnable r2 = () -> System.out.println("Runnable...");
        r2.run();
    }

    // 语法格式2：Lambda需要一个参数，但是没有返回值
    @Test
    public void test2() {
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };
        consumer.accept("我是你，你是谁？");

        System.out.println("*********************");

        // 语法格式3：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
        Consumer<String> con = (str) -> System.out.println(str);
        con.accept("你管我是谁");
    }

    // 语法格式4：Lambda 若只要一个参数时，参数的小括号可以省略
    public void test3() {
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };
        consumer.accept("我是你，你是谁？");

        System.out.println("*********************");

        // 小括号可以省略
        Consumer<String> con = str -> System.out.println(str);
        con.accept("你管我是谁");
    }

    // 语法格式5：Lambda 若有两个及以上的参数时，多条执行语句，并且可以有返回值
    @Test
    public void test5() {
        Comparator<Integer> com1 = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12,21));

        System.out.println("***********************");

        Comparator<Integer> com2 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(12, 21));
    }

    // 语法格式6：当Lambda体只有一条语句时，return 与大括号若有则都可以省略
    @Test
    public void test6() {
        Comparator<Integer> com1 = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12,21));

        System.out.println("***********************");

        Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(12, 21));
    }


}
