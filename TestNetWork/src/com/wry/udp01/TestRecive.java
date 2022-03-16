package com.wry.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Classname : TestRecive
 * @Description :接收端
 * @Date : 2022/3/15 6:32 PM
 * @Created by wangruiyang
 */
public class TestRecive {
    //这是一个main方法，是程序的入口
    public static void main(String[] args){
        System.out.println("教师端就绪");
        DatagramSocket ds = null;
        Scanner sc = new Scanner(System.in);
        try {
//        创建套接字 并指定接收端口
            ds = new DatagramSocket(9999);
            while (true) {
//        创建准备接受数据的数据包
                byte[] bytes =new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
//        接收数据包并填充
                ds.receive(dp);
                String str = new String(dp.getData(),0,dp.getLength());
                if ("学生：byebye".equals(str)) {
                    System.out.println("学生已下线");
                    break;
                } else {
                    System.out.println(str);//取有效部分转String
                }
//        回复
//        准备数据包
                str = "老师：" + sc.next();
                bytes = str.getBytes();
//        封装数据 指定学生ip和端口号
                dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 8888);
                ds.send(dp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        关闭资源
            if (ds != null) {
                ds.close();
            }
            sc.close();
        }

    }
}
