import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:TCPTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/9 18:39
 * @Version 1.0
 */
public class TCPTest {
    @Test
    public void server() throws IOException {
        // 创建ServerSocket
        int port = 8090;
        ServerSocket serverSocket = new ServerSocket(port);

        // 接受客户端的socket
        Socket socket = serverSocket.accept();

        // 新建文件类
        File file = new File("123_new.jpg");
        FileOutputStream fos = new FileOutputStream(file);

        // 接受数据
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        System.out.println("数据接收完毕");

        OutputStream os = socket.getOutputStream();
        os.write("服务器收到了图片".getBytes());

        // 关闭流
        is.close();
        fos.close();
        socket.close();
        serverSocket.close();
    }

    @Test
    public void client() throws IOException {
        // 创建socket
        InetAddress inet = InetAddress.getLocalHost();
        int port = 8090;
        Socket socket = new Socket(inet, port);

        // 创建文件类
        File file = new File("123.jpg");
        FileInputStream fis = new FileInputStream(file);

        // 读出数据
        OutputStream os = socket.getOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        System.out.println("发送成功！");
        socket.shutdownOutput();

        // 接受服务器信息
        InputStream is = socket.getInputStream();
        byte[] buffer1 = new byte[1024];
        int len1;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((len1 = is.read(buffer1)) != -1) {
            baos.write(buffer1, 0, len1);
        }
        System.out.println(baos);

        // 关闭流
        os.close();
        fis.close();
        socket.close();

    }
}
