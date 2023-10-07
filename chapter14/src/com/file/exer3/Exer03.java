package com.file.exer3;

import java.io.File;

/**
 * ClassName:Exer03
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/7 18:50
 * @Version 1.0
 */
public class Exer03 {
    // 递归打印文件名称
    public void printFile(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                printFile(file1);
            }
        }
    }

    // 递归查找指定文件
    public void judgementSuffix(File file){
        if(file.isFile()){
            String path = file.getPath();
            if(path.endsWith(".jpg")){
                System.out.println(file.getName());
            }
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                judgementSuffix(file1);
            }
        }

    }
    public static void main(String[] args) {
        Exer03 e = new Exer03();
        File file = new File("C:\\Users\\Dell\\Desktop\\文献");
        e.printFile(file);
        e.judgementSuffix(file);
    }
}
