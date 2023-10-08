package com.file.exer1;

import java.io.File;

/**
 * ClassName:Exer01
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/7 17:57
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        File file1 = new File("123_utf8.txt");
        System.out.println(file1.getAbsolutePath());
//        System.out.println(file1.getAbsoluteFile().getParent());
        File file2 = new File(file1.getAbsoluteFile().getParent(), "abc.txt");
        System.out.println(file2.getAbsoluteFile());

    }
}
