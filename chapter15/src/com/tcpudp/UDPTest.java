package com.tcpudp;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * ClassName:UDPTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/9 21:33
 * @Version 1.0
 */
public class UDPTest {
    @Test
    public void sender() throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress inet = InetAddress.getLocalHost();
        int port = 8090;
        byte[] bytes = "我是发送端".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, inet, port);

        datagramSocket.send(packet);
        datagramSocket.close();
    }

    @Test
    public void receiver() throws IOException {
        int port = 8090;
        DatagramSocket datagramSocket = new DatagramSocket(port);

        byte[] bytes = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);

        datagramSocket.receive(packet);

        String str = new String(packet.getData(), 0, packet.getLength());
        System.out.println(str);

        datagramSocket.close();
    }
}
