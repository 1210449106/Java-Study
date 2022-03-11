package com.wry.login02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Classname : TestClient
 * @Description : 客户端 双向通信
 * @Date : 2022/3/11 5:09 PM
 * @Created by wangruiyang
 */
public class TestClient {//客户端
    //这是一个main方法，是程序的入口
    public static void main(String[] args){
//        1.创建套接字:必须指定服务器ip和端口号
        Socket s = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;
        InputStream is =null;
        DataInputStream dis = null;
        try {
            s = new Socket("192.168.68.35",8888);
            //        录入用户名密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账号");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
//        2.向外发送数据==》输出流
            os = s.getOutputStream();
            oos = new ObjectOutputStream(os);
//        利用OutputStream就可以向外发送数据了，但是没有直接发送String的方法
//        所以我们又在OutputStream外面套了一个处理流：DataOutPutStream
            oos.writeObject(new User(username,password));
//        接收服务端的回话 -->利用流
            is = s.getInputStream();
            dis = new DataInputStream(is);
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            System.out.println("服务器连接失败");;
        }finally {
            //        关闭流 网络资源
            try {
                if (oos != null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
