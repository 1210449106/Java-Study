package com.wry.test01;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @Classname : Test02
 * @Description :
 * @Date : 2022/3/11 4:52 PM
 * @Created by wangruiyang
 */
public class Test02 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("baidu.com",80);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());
        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostAddress());
    }
}
