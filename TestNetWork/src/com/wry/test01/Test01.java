package com.wry.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Classname : Test01
 * @Description :
 * @Date : 2022/3/11 4:37 PM
 * @Created by wangruiyang
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws UnknownHostException {
//    封装ip
//    InetAddress ia = new InetAdress();不能直接创建对象，因为InetAdress()被default修饰了
        InetAddress ia = InetAddress.getByName("192.168.1.100");//封装ip
        System.out.println(ia);
        InetAddress ia2 = InetAddress.getByName("baidu.com");//封装域名
        System.out.println(ia2);
        InetAddress ia3 = InetAddress.getByName("DS3617xs");//封装计算机名
        System.out.println(ia3);
        System.out.println(ia2.getHostName());//获取域名
        System.out.println(ia.getHostAddress());//获取ip
    }
}