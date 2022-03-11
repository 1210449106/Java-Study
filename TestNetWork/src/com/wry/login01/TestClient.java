package com.wry.login01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname : TestClient
 * @Description : 客户端 双向通信
 * @Date : 2022/3/11 5:09 PM
 * @Created by wangruiyang
 */
public class TestClient {//客户端
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws IOException {
//        1.创建套接字:必须指定服务器ip和端口号
        Socket s = new Socket("192.168.68.35",8888);
//        2.向外发送数据==》输出流
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
//        利用OutputStream就可以向外发送数据了，但是没有直接发送String的方法
//        所以我们又在OutputStream外面套了一个处理流：DataOutPutStream
        dos.writeUTF("你好");
//        接收服务端的回话 -->利用流
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        System.out.println(dis.readUTF());
//        关闭流 网络资源
        dos.close();
        s.close();
    }
}
