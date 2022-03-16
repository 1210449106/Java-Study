package com.wry.udp02;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;

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
        try {
//        准备发送方套接字 指定端口
            ds = new DatagramSocket(8888);
//        准备数据包
            String str = "老师你好";
            byte[] bytes = str.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 9999);
//        发送数据包
            ds.send(dp);
//        接收老师发送回来的信息
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        关闭网络资源
            if (ds != null) {
                ds.close();
            }
        }

    }
}
