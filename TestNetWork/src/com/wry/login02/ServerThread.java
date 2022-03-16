package com.wry.login02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname : ServerThread
 * @Description : 处理客户端请求
 * @Date : 2022/3/14 10:58 AM
 * @Created by wangruiyang
 */
public class ServerThread extends Thread{
    InputStream is =null;
    ObjectInputStream ois =null;
    OutputStream os = null;
    DataOutputStream dos = null;
    Socket s = null;
    @Override
    public void run() {
        try {
//        3.准备输出流
            os = s.getOutputStream();
            dos = new DataOutputStream(os);
//        4.接到Socket之后，客户端和服务器才真正可以通信(得到输入流)
            is = s.getInputStream();
            ois = new ObjectInputStream(is);
//        5.读取数据
            User user = (User)(ois.readObject());
//        6,开始判断并返回结果
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
        }
    }
//    构造方法
    public ServerThread(Socket s) {
        this.s = s;
    }
}
