package com.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:TCPTest2
 * Description:
 * 客户端发送文件给服务器将我呢见保存在本地
 *
 * @Author ZY
 * @Create 2023/10/9 16:55
 * @Version 1.0
 */
public class TCPTest2 {
    // 服务端
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

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

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

        // 读写数据
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }

        // 关闭资源
        fis.close();
        os.close();
        socket.close();
    }
}
