package com.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:TCPTest3
 * Description:
 * 从客户端发送文件给服务端，服务端保存到本地，并返回”发送成功“给客户端。
 * 并关闭相应的连接
 *
 * @Author ZY
 * @Create 2023/10/9 17:26
 * @Version 1.0
 */
public class TCPTest3 { // 服务端
    @Test
    public void server() throws IOException {
        // 1.创建一个ServerSocket
        int port = 8090;
        ServerSocket serverSocket = new ServerSocket(port);

        // 2.接受客户端Socket
        Socket socket = serverSocket.accept();

        // 3.通过Socket获取一个输入流
        InputStream is = socket.getInputStream();

        // 4.创建File类的实例、FileOutputStream的实例
        File file = new File("C:\\Users\\Dell\\Desktop\\123_new.jpg");
        FileOutputStream fos = new FileOutputStream(file);

        // 5.读写过程
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        System.out.println("数据接受完毕");

        // 6.服务端发送数据给客户端
        OutputStream os = socket.getOutputStream();
        os.write("服务端接收到了你的图片".getBytes());


        // 关闭相应的socket以及流
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }

    // 客户端
    @Test
    public void client() throws IOException {
        // 1.创建socket
        InetAddress inet = InetAddress.getLocalHost();
        int port = 8090;
        Socket socket = new Socket(inet, port);

        // 2.创建File的实例、FileInputStream的实例
        File file = new File("123.jpg");
        FileInputStream fis = new FileInputStream(file);

        // 3.通过Socket获取输出流
        OutputStream os = socket.getOutputStream();

        // 4.读写数据
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        System.out.println("数据发送完毕");
        // 客户端表明不再继续发送数据
        socket.shutdownOutput();

        // 5.接收来自于服务器端的数据
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len1;
        byte[] buffer1 = new byte[1024];
        while ((len1 = is.read(buffer1)) != -1) {
            baos.write(buffer1, 0, len1);
        }
        System.out.println(baos);


        // 关闭资源
        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}
