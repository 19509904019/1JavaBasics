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

    public String stringSort(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }
}