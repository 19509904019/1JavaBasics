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
public class DemoTest {
    public static void main(String[] args) {
        int count = getMaxCommonSubstring("ab","abkkcadkabkebfkabkskab");
        System.out.println(count);

    }

    public static int getMaxCommonSubstring(String str1, String str2) {
        int count = 0;
        if(str1.length() <= str2.length()){
            int index = str2.indexOf(str1);

            while(index >= 0){
                count++;
                index = str2.indexOf(str1,index + str1.length());
            }
        }
        return count;
    }
}