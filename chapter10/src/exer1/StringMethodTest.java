package exer1;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName:StringMethodTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/24 13:29
 * @Version 1.0
 */
public class StringMethodTest {
    /**
     * String构造器的使用
     */
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(s3);
    }

    /**
     * String与常见的其他结构之间的转换
     * 1.String与基本数据类型、包装类之间的转换
     * <p>
     * 2.String与char[]之间的转换
     * <p>
     * 3.String与byte[]之间的转换（难度）
     */
    @Test
    public void test2() {
        // 基本数据类型：调用包装类的parseXxx(String str)
        String s1 = "123";
        int num1 = Integer.parseInt(s1);
        System.out.println(num1);

        //将基本数据类型转换成包装类
        // 方式1
        String s2 = num1 + "";
        System.out.println(s2.getClass());
        //方式2
        String s3 = String.valueOf(num1);
        System.out.println(s3.getClass());
    }

    // String 与 char[] 之间的转换
    @Test
    public void test3() {
        String str = "abc";
        //String ---> char[]:调用String的toCharArray()
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //char[] ---> String:调用String的构造器
        String str1 = new String(arr);
        System.out.println(str1);
        System.out.println(str1.getClass());
    }

    // String 与 byte[] 之间的转换:调用String的getBytes()
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = "abc中国";  // 在UTF-8字符集中，一个汉字占用3个字节，一个字母占用1个字节

        // String --> byte[]:调用String的getBytes()
        byte[] arr = str.getBytes();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        // getBytes(String charsetName):使用指定的字符集
        byte[] arr1 = str.getBytes("gbk");// 在GBK字符集中，一个汉字占用2个字节，一个字母占用1个字节
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // byte[] ---> String:
        /*
         * 编码：String ---> 字节或字节数组
         * 解码：字节或字节数组 ---> String
         * 要求：解码时使用的字符集必须与编码时使用的字符集一致，不一致则会乱码
         */
        String str1 = new String(arr);
        System.out.println(str1);

        // 指定字符集
        String str2 = new String(arr1,"gbk");
        System.out.println(str2);
    }
}
