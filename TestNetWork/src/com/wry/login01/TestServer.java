package com.wry.login01;

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
    public static void main(String[] args) throws IOException {
//        1.创建套接字
        ServerSocket ss = new ServerSocket(8888);
//        2.等客户端的信息
        Socket s = ss.accept();//阻塞方法：等待接收客户端的数据，什么时候收到数据，什么时候继续向下执行
//        accept()返回值为一个Socket，这个Socket是客户端的Socket
//        3.接到Socket之后，客户端和服务器才真正可以通信
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
//        4.读取数据
        System.out.println("客户端发来的数据为----"+dis.readUTF());
//        向客户端输出一句话
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("我很好");
//        关闭流+网络资源
        dis.close();
        dos.close();
        ss.close();
    }
}
