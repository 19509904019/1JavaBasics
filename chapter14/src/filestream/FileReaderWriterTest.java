package filestream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName:FileReaderWriterTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/7 20:05
 * @Version 1.0
 */
public class FileReaderWriterTest {
    @Test
    public void test1() throws IOException {
        // 1.创建File类的对象，对应着hello.txt文件
        File file = new File("hello.txt");

        // 2.创建输入型的字符流，用于读取数据
        FileReader fileReader = new FileReader(file);

        // 3.读取数据，并显示在控制台上
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        // 4.流资源的关闭操作
        fileReader.close();
    }

    /**
     * 使用try-catch的方式处理异常，确保流一定可以关闭，避免内存泄露
     */
    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            // 1.创建File类的对象，对应着hello.txt文件
            File file = new File("hello.txt");

            // 2.创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);
            // 3.读取数据，并显示在控制台上
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.流资源的关闭操作
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() {
        FileReader fileReader = null;
        try {
            // 1.创建File类的对象，对应着hello.txt文件
            File file = new File("hello.txt");

            // 2.创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);
            // 3.读取数据，并显示在控制台上
            char[] cbuffer = new char[3];
            int len;
            while ((len = fileReader.read(cbuffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuffer[i]);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.流资源的关闭操作
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 需求：将内存中的数据写出到指定的文件中
     */
    @Test
    public void test4() {
        FileWriter fileWriter = null;
        try {
            // 1.创建File类的对象，指明要写出的文件的名称
            File file = new File("123.txt");

            // 2.创建输出流
            // 覆盖文件使用的构造器
//            fileWriter = new FileWriter(file,false);

            // 在现有的文件基础上，追加内容使用的构造器
            fileWriter = new FileWriter(file, true);

            // 3.写出具体过程
            fileWriter.write("haiyan\n");
            fileWriter.write("123\n");
            fileWriter.write("yujun");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭资源
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 需求：复制一份hello.txt文件，命名为hello.copy.txt
     */
    @Test
    public void test5() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            // 读取文件
            File file = new File("hello.txt");
            fileReader = new FileReader(file);

            // 写入新文件
            File newFile = new File("hello_copy.txt");
            fileWriter = new FileWriter(newFile);

            // 读出信息并写入新文件中
            char[] cbuffer = new char[4];
            int len;  // 记录每次读入到cbuffer中的字符的个数
            while ((len = fileReader.read(cbuffer)) != -1) {
//                for (int i = 0; i < len; i++) {
//                    fileWriter.write(cbuffer[i]);
//                }
                // write(char[], int fromIndex, int len)
                fileWriter.write(cbuffer, 0, len); // 批量写入缓冲区的数据
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter != null)
                    fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
