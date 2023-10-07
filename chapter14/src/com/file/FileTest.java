package com.file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName:FileTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/7 16:56
 * @Version 1.0
 */
public class FileTest {
    /*
     * public File(String pathname):
     * public File(String parent, String child)
     * public File(File parent, String child)
     * */
    @Test
    public void test1() {
        File file = new File("abc.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
    }

    @Test
    public void test2() {
        /*
         * public String[] list():返回一个String数组，表示该File目录中的所有子文件或目录
         * public File[] listFiles():返回一个File数组，表示该File目录中所有的子文件或目录
         * */
        File file = new File("D:\\java\\exercise\\JavaSECode");
        String[] fileArr = file.list();
        for (var f : fileArr) {
            System.out.println(f);
        }

        System.out.println();

        File[] files = file.listFiles();
        for(var fs : files){
            System.out.println(fs.getName());
            System.out.println(fs.length());
        }
    }

    @Test
    public void test3(){
        /*
        * public boolean renameTo(File dest):把文件命名为指定的文件路径
        *   file
        *
        * */
        File file1 = new File("Test.txt");
        File file2 = new File("D:\\java\\exercise\\JavaSECode\\chapter14\\src\\com\\file\\test.txt");
        file1.renameTo(file2);
    }

    @Test
    public void test4(){
        /*
        * public boolean exists()
        * public boolean isFile()
        * public boolean isDirectory()
        * public boolean canRead()
        * public boolean canWrite()
        * public boolean isHidden()
        * */
    }

    @Test
    public void test5(){
        /*
        * public boolean createNewFile()：创建文件，若文件存在则不创建，返回false
        * public boolean mkdir()：创建文件目录。如果此文件目录存在则不创建
        * public boolean mkdirs()：创建文件目录。如果上次文件不存在一并创建
        * public delete():删除文件或文件夹
        * */
    }
}
