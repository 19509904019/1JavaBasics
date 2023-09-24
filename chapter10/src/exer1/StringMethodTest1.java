package exer1;

import org.junit.Test;

/**
 * ClassName:StringMethodTest1
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/24 19:31
 * @Version 1.0
 */
public class StringMethodTest1 {
    /*
     * (1) boolean isEmpty():字符串是否为空
     * (2) int length():返回字符串的长度
     * (3) String concat(xx):拼接
     * (4) boolean equals(Object obj):比较字符串是否相等，区分大小写
     * (5) boolean equalsIgnoreCase(Object obj):比较字符串是否相等，不区分大小写
     * (6) int compareTo(String other):比较字符串大小，区分大小写，按照Unicode编码值比较大小
     * (7) int compareToIgnoreCase(String other):比较字符串大小，不区分大小写
     * (8) String toLowerCase():将字符串中大写字母转为小写
     * (9) String toUpperCase():将字符串中小写字母转为大写
     * (10) String trim():去掉字符串前后空白符
     * (11) public String intern():结果在常量池中共享
     * */
    @Test
    public void test1() {
        String str = "aBc";
        System.out.println(str.toUpperCase());
    }


    /*
     * (11) boolean contains(xx): 是否包含xx
     * (12) int indexOf(xx): 从前往后查找当前字符串中xx,即如果有返回第一次出现的下标，要是没有返回-1
     * (13) int indexOf(String str, int fromIndex):返回指定子字符串在此字符串中第一次出现处的索引
     * (14) int lastIndexOf(xx):从后往前查找当前字符串中xx,即如果有返回第一次出现的下标，要是没有返回-1
     * (15) int lastIndexOf(String str, int fromIndex):返回指定子字符串在此字符串中最后一次出现处的索引
     * */

    @Test
    public void test2() {
        String str = "教育尚硅谷教育";
        System.out.println(str.contains("教育"));
        System.out.println(str.indexOf("硅谷")); //3
        System.out.println(str.lastIndexOf("教育"));  //5
        System.out.println(str.lastIndexOf("教育", 4));  //0
    }


    /*
     * (16) String substring(int beginIndex):返回一个新的字符串，它是此字符串的从beginIndex开始截取的
     * (17)String substring(int beginIndex， int endIndex):返回一个新的字符串，它是此字符串的从beginIndex开始截取，endIndex结束
     * */

    @Test
    public void test3() {
        String str = "尚硅谷教育";
        System.out.println(str.substring(1));
        System.out.println(str.substring(1, 3)); //[1,3)
    }

    /*
     * (18)char charAt(index):返回[index]位置的字符
     * (19)static String valueOf(char[] data):返回指定数组中表示该字符序列的String
     * (20)static String valueOf(char[] data, int offset, int count):返回指定数组中表示该字符序列的String
     * (21)static String copyValueOf(char[] data):返回指定数组中表示该字符序列的String
     * (22)static String copyValueOf(char[] data, int offset, int count):返回指定数组中表示该字符序列的String
     * (23)boolean startWith(xx):测试此字符串是否以指定的前缀开始
     * (24)boolean startWith(String prefix, int toffset):测试此字符串从指定索引开始的子字符串是否以指定前缀开始
     * (25)boolean endsWith(xx):测试此字符串是否以指定的后缀结束
     * */

    @Test
    public void test4() {
        String str = "abcdefg";
        System.out.println(str.charAt(2));

        char[] arr1 = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        System.out.println(String.valueOf(arr1));
        System.out.println(String.valueOf(arr1,2,6));

        //与 String.valueOf()方法不同的是，copyValueOf()方法返回的字符串是通过拷贝字符数组的内容而不是共享同一字符数组
        char[] arr2 = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        System.out.println(String.valueOf(arr2));
        System.out.println(String.valueOf(arr2,2,6));
    }
}
