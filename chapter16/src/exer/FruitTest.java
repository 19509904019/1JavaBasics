package exer;

import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * ClassName:FruitTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/11 16:27
 * @Version 1.0
 */
public class FruitTest {
    @Test
    public void test() throws Exception {
        // 加载配置文件获取全类名
        Properties properties = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().
                    getResourceAsStream("info.properties");
        properties.load(is);
        String fruitName = properties.getProperty("fruitName");

        // 创建当前全类名的实例
        Class<?> clazz = Class.forName(fruitName);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object fruit = constructor.newInstance();

        // 创建Juicer对象
        Juicer juicer = new Juicer();
        juicer.run((Fruit) fruit);
    }
}
