package com.throwable;

import org.junit.Test;

/**
 * ClassName:ExceptionTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/15 11:21
 * @Version 1.0
 */
public class ExceptionTest {
    @Test
    public void test1() {
        try {
            int[][] arr = new int[10][];
            System.out.println(arr[0][0]);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("出现NullPointerException异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("出现ArrayIndexOutOfBoundsException异常");
        } finally {
            System.out.println("异常处理完成，继续执行代码");
        }

    }
}
