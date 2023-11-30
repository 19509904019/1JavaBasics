package com.file.exer2;

import java.io.File;

/**
 * ClassName:Exer02
 * Description:判断指定目录下是否有后缀名为.jpg的文件，如果有就输出该文件名称
 *
 * @Author ZY
 * @Create 2023/10/7 18:01
 * @Version 1.0
 */
public class Exer02 {

    public static void main(String[] args) {
        // 方式1
        File file = new File("C:\\Users\\Dell\\Desktop\\csv");
        // 遍历目录中的文件
        String[] list = file.list();
        boolean isFlag = true;
        // 查找文件
        for (String s : list) {
            if (s.endsWith(".jpg")) {
                System.out.println(s);
                isFlag = false;
            }
        }
        if (isFlag) {
            System.out.println("未找到后缀名为.jpg的文件！");
        }


        // 方式2
        // 即为子文件或子文件目录
        String[] listFiles = file.list((dir, name) -> name.endsWith(".jpg"));

        if(listFiles.length == 0){
            System.out.println("未找到后缀名为.jpg的文件！");
        }

        for(String s: listFiles){
            System.out.println(s);
        }
    }
}
