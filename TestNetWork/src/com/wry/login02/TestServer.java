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
        ServerSocket ss = null;
        InputStream is = null;
        ObjectInputStream ois = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        try {
//        1.创建套接字
            ss = new ServerSocket(8888);
//        2.等客户端的信息
            Socket s = ss.accept();//阻塞方法：等待接收客户端的数据，什么时候收到数据，什么时候继续向下执行
//        accept()返回值为一个Socket，这个Socket是客户端的Socket
//        3.接到Socket之后，客户端和服务器才真正可以通信
            is = s.getInputStream();
            ois = new ObjectInputStream(is);
//        4.读取数据
            User user = (User)(ois.readObject());
//        5.准备输出流
            os = s.getOutputStream();
            dos = new DataOutputStream(os);
//        5,开始判断并返回结果
            if ("123456".equals(user.getUsername())&&"123456".equals(user.getPassword())){
                dos.writeUTF("登陆成功");
            }
            else {
                dos.writeUTF("登陆失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
//        关闭流+网络资源
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ss != null) {
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
