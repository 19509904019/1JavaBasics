package com.tcpudp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:TCPTest1
 * Description:
 * 客户端发送内容给服务器，服务端将内容打印到控制台上
 *
 * @Author ZY
 * @Create 2023/10/9 16:27
 * @Version 1.0
 */
public class TCPTest1 {
    // 客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            // 创建一个socket
            InetAddress inet = InetAddress.getLocalHost(); // 声明ip地址
            int port = 8980;  // 声明端口号
            socket = new Socket(inet, port);

            // 发送数据
            os = socket.getOutputStream();
            os.write("你好，世界！".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭socket、关闭流
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 服务端
    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket socket = null;  // 阻塞式方法
        InputStream is = null;
        try {
            // 1.创建一个ServerSocket
            int port = 8980;
            serverSocket = new ServerSocket(port);

            // 2.调用accept(),接收客户端Socket
            socket = serverSocket.accept();

            // 3.接受数据
            is = socket.getInputStream();
            byte[] buffer = new byte[1024];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int len;
            while ((len = is.read(buffer)) != -1) {
//                String str = new String(buffer, 0, len);
//                System.out.println(str);

                baos.write(buffer, 0, len);
            }
            System.out.println(baos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 4.关闭Socket、ServerSocket
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
