package com.string.exer3;

/**
 * ClassName:StringReverse
 * Description:将字符串中指定部分进行反转。比如将“abcdefgho”实现部分反转，结果为”abfedcgho”
 *
 * @Author ZY
 * @Create 2023/9/25 12:07
 * @Version 1.0
 */
public class StringReverse {
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();

        String str = "abcdefgho";
        System.out.println(sr.stringReverse(str, 2, 5));
        System.out.println(sr.stringReverse1(str, 2, 5));


    }

    public String stringReverse(String str, int fromIndex, int toIndex) {
        char[] stringNewArr = str.toCharArray();

        for (int i = fromIndex, j = toIndex; i <= j; i++, j--) {
            char temp = stringNewArr[i];
            stringNewArr[i] = stringNewArr[j];
            stringNewArr[j] = temp;
        }

        return new String(stringNewArr);
    }

    public String stringReverse1(String str, int fromIndex, int toIndex) {
        StringBuilder sb = new StringBuilder();

        // 第一部分
        String str1 = str.substring(0, fromIndex);
        sb.append(str1);

        // 第二部分
        for (int i = toIndex; i >= fromIndex; i--) {
            sb.append(str.charAt(i));
        }

        // 第三部分
        String str3 = str.substring(toIndex + 1);
        sb.append(str3);

        return sb.toString();
    }
}
