package com.net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName:com.net.InetAddressTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/9 14:38
 * @Version 1.0
 */
public class InetAddressTest {
    @Test
    public void test1() throws UnknownHostException {
        // getByName(String host):获取指定ip对应的InetAddress的实例
        InetAddress inet1 = InetAddress.getByName("192.168.52.203");
        System.out.println(inet1); // 192.168.52.203

        InetAddress inet2 = InetAddress.getByName("www.baidu.com");
        System.out.println(inet2);  // www.baidu.com/180.101.50.242

        // getLocalHost():获取本地ip对应的InetAddress的实例
        InetAddress inet3 = InetAddress.getLocalHost();
        System.out.println(inet3);  // ZY/172.16.123.81

        InetAddress inet4 = InetAddress.getByName("127.0.0.1");
        System.out.println(inet4);


        // 2. 两个常用方法
        System.out.println(inet2.getHostAddress()); // 180.101.50.188
        System.out.println(inet2.getHostName()); // www.baidu.com
    }
}
