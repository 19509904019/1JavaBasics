package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ClassName:StreamAPITest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/12 14:18
 * @Version 1.0
 */
public class StreamAPITest {
    // 创建Stream方式一：通过集合
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();
        // 返回一个顺序流
        Stream<Employee> stream = list.stream();

        // 返回一个并行流
        Stream<Employee> parallelStream = list.parallelStream();
        System.out.println(stream);
        System.out.println(parallelStream);

    }

    // 创建Stream方式二：通过数组
    @Test
    public void test2(){
        // 调用Arrays类的static <T> Stream<T> stream(T[] array):返回一个流
        Integer[] arr = new Integer[]{1,2,3,4,5,6};
        Stream<Integer> stream = Arrays.stream(arr);

        int[] arr1 = new int[5];
        IntStream stream1 = Arrays.stream(arr1);
    }

    // 创建Stream方式三：通过Stream的of()
    @Test
    public void test3(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);

    }
}
