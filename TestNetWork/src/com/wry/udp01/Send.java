package com.wry.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Classname : Send
 * @Description :发送端
 * @Date : 2022/3/15 6:32 PM
 * @Created by wangruiyang
 */
public class Send {
    //这是一个main方法，是程序的入口
    public static void main(String[] args){
        System.out.println("学生端就绪");
        DatagramSocket ds = null;
        Scanner sc = new Scanner(System.in);
        try {
//        准备发送方套接字 指定端口
            ds = new DatagramSocket(8888);
            while (true) {
//        准备数据包
                String str = "学生：" + sc.next();
                byte[] bytes = str.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 9999);
//        发送数据包
                ds.send(dp);
                if ("学生：byebye".equals(str)) {
                    System.out.println("对话已结束");
                    break;
                }
//        接收老师发送回来的信息
                ds.receive(dp);
                System.out.println(new String(dp.getData(),0,dp.getLength()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        关闭网络资源
            if (ds != null) {
                ds.close();
            }
            sc.close();
        }

    }
}
