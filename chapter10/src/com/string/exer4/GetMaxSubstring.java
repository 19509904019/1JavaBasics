package com.string.exer4;

/**
 * ClassName:GetMaxSubstring
 * Description:
 * 获取两个字符串中最大相同子串。比如：
 * str1 = "abcwerthelloyuiodef"; str2 = "cvhellobnm"的最大相同子串是"hello"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 *
 * @Author ZY
 * @Create 2023/9/25 13:34
 * @Version 1.0
 */
public class GetMaxSubstring {
    public static void main(String[] args) {
        GetMaxSubstring getMaxSubstring = new GetMaxSubstring();
        String str1 = "abcwerthelloyuiodefhellosfafac";
        String str2 = "cvhellobnm";
        String str = getMaxSubstring.getMaxCommonSubstring(str1, str2);
        System.out.println(str);

        int count = getMaxSubstring.getMaxCommonSubstringCount(str1, str2);
        System.out.println(count);

    }

    public String getMaxCommonSubstring(String str1, String str2) {
        // 判断字符串长度
        String shortStr;
        String longStr;
        if (str1.length() > str2.length()) {
            shortStr = str2;
            longStr = str1;
        } else {
            shortStr = str1;
            longStr = str2;
        }

        // 短字符串在长字符串中进行滑动对比
        for (int i = shortStr.length(); i > 0; i--) {   //进行对比的字符串长度
            for (int j = 0; j <= shortStr.length() - i; j++) {   // 进行对比的次数
                String substring = shortStr.substring(j, j + i);
                if (longStr.contains(substring)) {
                    return substring;
                }
            }
        }
        return "无相同字符串";
    }

    public int getMaxCommonSubstringCount(String str1, String str2) {
        int count = 0;
        // 获得公共子串
        String commonString = getMaxCommonSubstring(str1, str2);

        int index = str1.indexOf(commonString);

        while (index >= 0) {
            count++;
            index = str1.indexOf(commonString,index+commonString.length());
        }

        return count;
    }
}
