package com.ObjectInputOutput;

import com.ObjectInputOutput.exer1.Person;
import org.junit.Test;

import java.io.*;

/**
 * ClassName:ObjectInputOutputTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/8 21:09
 * @Version 1.0
 */
public class ObjectInputOutputTest {
    @Test
    public void test1() throws IOException {
        // 1.
        File file = new File("object.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 2. 写出数据即为序列化的过程
        oos.writeUTF("江山如此多娇");
        oos.flush();

        oos.writeObject("轻轻的我走了");
        oos.flush();

        oos.close();
    }

    /*
     * 反序列化过程：使用ObjectInputStream流实现
     * */
    @Test
    public void test2() throws IOException, ClassNotFoundException {
        // 1.
        File file = new File("object.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 2.读取文件中的对象（或反序列化的过程）
        String str1 = ois.readUTF();
        System.out.println(str1);

        String str2 = (String) ois.readObject();
        System.out.println(str2);

        ois.close();
    }

    /**
     * 序列化
     *
     * @throws IOException 抛出异常
     */
    @Test
    public void test3() throws IOException {
        // 1.
        File file = new File("Object.bat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        // 2.
        Person person = new Person("yujun", 18);
        oos.writeObject(person);
        oos.flush();

        // 3.
        oos.close();
    }

    /**
     * 反序列化
     */
    @Test
    public void test4() throws IOException, ClassNotFoundException {
        // 1.
        File file = new File("object.bat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 2.
        Person person = (Person) ois.readObject();
        System.out.println(person);

        // 3.
        ois.close();
    }
}
