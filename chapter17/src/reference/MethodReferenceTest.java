package reference;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * ClassName:MethodReferenceTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/12 10:17
 * @Version 1.0
 */
public class MethodReferenceTest {
    @Test
    public void test1() {
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        con1.accept("hello world!");

        // 2. lambda表达式
        Consumer<String> con2 = s -> System.out.println(s);
        con2.accept("hello too!");

        // 3.方法引用
        Consumer<String> con3 = System.out::println;
        con3.accept("Hi");
    }

    @Test
    public void test2() {
        Comparator<Integer> com1 = new Comparator<>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(com1.compare(12, 21));

        // lambda
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(com2.compare(12, 21));

        // 方法引用
        Comparator<Integer> com3 = Integer::compare;
        System.out.println(com3.compare(12, 12));

    }

    @Test
    public void test3() {
        Comparator<String> com1 = new Comparator<>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare("a", "b"));

        // lambda
        Comparator<String> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare("a", "a"));

        // 方法引用
        Comparator<String> com3 = String :: compareTo;
        System.out.println(com3.compare("b", "a"));

    }
}
