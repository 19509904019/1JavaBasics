package optional;

import org.junit.Test;

import java.util.Optional;

/**
 * ClassName:OptionalTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/12 22:03
 * @Version 1.0
 */
public class OptionalTest {
    @Test
    public void test(){
        String str = "yujun";
        str = null;

        /*
        * 使用optional避免空指针问题
        * */

        // 1.实例化
        // ofNullable(T value):用来创建一个Optional实例，value可能是空，也可能非空
        Optional<String> optional = Optional.ofNullable(str);
        
        //orElse(T other):如果Optional实例内部的value属性不为null,则返回value
        // 如果value为null,则返回other
        String other = "haiyan";
        String finalStr = optional.orElse(other);

        System.out.println(finalStr);
    }

}
