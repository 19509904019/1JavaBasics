package com.string.exer5;

/**
 * ClassName:GetStringCommonCount
 * Description:
 * 获得一个字符串在另一个字符串中出现的次数
 * 比如：获取”ab“在”abkkcadkabkebfkabkskab“中出现的次数
 *
 * @Author ZY
 * @Create 2023/9/25 14:21
 * @Version 1.0
 */
public class GetStringCommonCount {
    public static void main(String[] args) {
        String str1 = "abkkcadabkkebfkabksk";
        String str2 = "ab";

        GetStringCommonCount g = new GetStringCommonCount();
        System.out.println(g.getCommonSubstringCount(str1, str2));
    }

    public int getCommonSubstringCount(String str1, String str2) {
        int count = 0;
        String commonStr;
        String originalStr;

        // 区分原字符串和子字符串
        if (str1.length() < str2.length()) {
            commonStr = str1;
            originalStr = str2;
        } else {
            commonStr = str2;
            originalStr = str1;
        }

        // 判断出现次数，如果不包含子字符串则退出
        while (originalStr.contains(commonStr)) {
            // 只要进入循环就自增1
            count++;

            // 重新更新字符串
            int index = originalStr.indexOf(commonStr);
            originalStr = originalStr.substring(index + commonStr.length());
        }
        return count;
    }

    public int getCommonSubstringCount1(String str1, String str2) {
        int count = 0;
        if (str1.length() >= str2.length()) {
            int index = str1.indexOf(str2);

            while (index >= 0) {
                count++;
                index = str1.indexOf(str2, index + str2.length());
            }
        }

        return count;
    }
}
