package com.wry.login02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname : TestServer
 * @Description :服务端 双向通信
 * @Date : 2022/3/11 5:16 PM
 * @Created by wangruiyang
 */
public class TestServer {
    //这是一个main方法，是程序的入口
    public static void main(String[] args){
        System.out.println("服务器已启动");
        ServerSocket ss = null;
        Socket s = null;
        int count = 0;
        try {
//        1.创建套接字
            ss = new ServerSocket(8888);
//        2.等客户端的信息
            while (true) {//创建死循环 负责一直监听消息
//        accept()返回值为一个Socket，这个Socket是客户端的Socket
                s = ss.accept();////阻塞方法：等待接收客户端的数据，什么时候收到数据，什么时候继续向下执行
//                每次的请求都创建一个线程处理
                new ServerThread(s).start();
                System.out.println("这是本服务器的第"+ ++count +"个登陆请求");
            }
        } catch (IOException e) {
            System.out.println("服务器启动失败");
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
