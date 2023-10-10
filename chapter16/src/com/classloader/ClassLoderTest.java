package com.classloader;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName:ClassLoderTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/10 17:02
 * @Version 1.0
 */
public class ClassLoderTest {
    // Properties：处理属性文件,数据和代码的分离
    @Test
    public void test1() throws IOException {
        Properties properties = new Properties();

        // 读取的文件默认路径为：当前module下
        FileInputStream fis = new FileInputStream(new File("info.properties"));

        // 加载信息
        properties.load(fis);

        // 接收信息
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        System.out.println(name + ":" + age);
    }

    @Test
    public void test2() throws IOException {
        Properties properties = new Properties();

        // 通过类的加载器读取的文件的默认的路径为：当前module下的src下
        InputStream is = ClassLoader.getSystemClassLoader()
                    .getResourceAsStream("info.properties");
        // 加载信息
        properties.load(is);

        // 接收信息
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        System.out.println(name + ":" + age);
    }
}
