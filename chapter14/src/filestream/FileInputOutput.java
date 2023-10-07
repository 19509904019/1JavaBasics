package filestream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName:FileInputOutput
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/7 22:13
 * @Version 1.0
 */
public class FileInputOutput {
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 1. 创建相关的File类的对象
            File file = new File("123.jpg");
            File newFile = new File("123_copy.jpg");

            // 2. 创建相关的字节流
            fis = new FileInputStream(file);
            fos = new FileOutputStream(newFile);

            // 3.数据的读入和写出
            byte[] cbuffer = new byte[1024];
            int len;  // 记录每次读入到cbuffer中的字符的个数
            while ((len = fis.read(cbuffer)) != -1) {
                // write(char[], int fromIndex, int len)
                fos.write(cbuffer, 0, len); // 批量写入缓冲区的数据
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            if (fos != null) {
                fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

