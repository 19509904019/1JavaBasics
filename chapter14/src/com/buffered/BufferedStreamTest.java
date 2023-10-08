package com.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName:BufferedStreamTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/8 14:56
 * @Version 1.0
 */
public class BufferedStreamTest {
    @Test
    public void test1() {

        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
            // 1.创建相关的File类的对象
            File srcFile = new File("123.jpg");
            File destFile = new File("123_new.jpg");

//            // 2.创建相关的字节流、缓冲流
//            FileInputStream fis = new FileInputStream(srcFile);
//            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(new FileInputStream(srcFile));
            bos = new BufferedOutputStream(new FileOutputStream(destFile));
            // 3.数据的读入和写出
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流操作
            // 由于外层流的关闭也会自动关闭内层流，内层流可以省略
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
