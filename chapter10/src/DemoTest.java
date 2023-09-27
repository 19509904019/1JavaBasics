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


    }

    public int getMaxCommonSubstring(String str1, String str2) {
        int count = 0;
        if(str1.length() >= str2.length()){
            int index = str1.indexOf(str2);

            while(index >= 0){
                count++;
                index = str1.indexOf(str2,index + str2.length());
            }
        }
        return count;
    }
}