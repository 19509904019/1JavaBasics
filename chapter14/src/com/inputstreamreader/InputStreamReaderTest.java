package com.inputstreamreader;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * ClassName:InputStreamReaderTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/8 16:26
 * @Version 1.0
 */
public class InputStreamReaderTest {
    @Test
    public void test1() throws IOException {
        // 1. 创建File类的对象
        File file = new File("123_utf8.txt");
        // 2. 创建流对象
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        char[] cBffer = new char[1024];
        int len;
        while ((len = isr.read(cBffer)) != -1) {
            String str = new String(cBffer, 0, len);
            System.out.println(str);
        }

        isr.close();
    }

    /*
     *需求：将gbk格式的文件转换为utf-8格式的文件存储
     *
     **/
    @Test
    public void test2() throws IOException {
        // 1. 造文件
        File file1 = new File("123_utf8.txt");
        File file2 = new File("123_toGBK.txt");

        // 2.造流
        FileInputStream fis = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(fis);

        FileOutputStream fos = new FileOutputStream(file2);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");

        // 3.读写过程
        char[] cbuffer = new char[1024];
        int len;
        while ((len = isr.read(cbuffer)) != -1) {
            osw.write(cbuffer, 0, len);
        }

        // 4.关闭资源
        osw.close();
        isr.close();
    }
}
