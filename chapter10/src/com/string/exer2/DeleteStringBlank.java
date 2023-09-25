package com.string.exer2;

/**
 * ClassName:practice1
 * Description:不能使用trim()，实现去除字符串两端的空格。
 *
 * @Author ZY
 * @Create 2023/9/25 9:57
 * @Version 1.0
 */
public class DeleteStringBlank {
    public static void main(String[] args) {

        String str = "    Hello   ";
        DeleteStringBlank p = new DeleteStringBlank();
        String str1 = p.deleteStringBlank(str);
        System.out.println(str1);

    }

//    public String deleteStringBlank(String str) {
//        char[] arr = str.toCharArray();
//        String str1 = "";
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != ' ') {
//                str1 += arr[i];
//            }
//        }
//        return str1;
//    }

    public String deleteStringBlank(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ')
            start++;

        while (start <= end && str.charAt(end) == ' ')
            end--;

        return str.substring(start, end + 1);
    }
}


