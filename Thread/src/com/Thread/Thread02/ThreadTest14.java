package com.Thread.Thread02;

/**
 * @Classname : ThreadTest14
 * @Description :
 * @Date : 2022/4/21 3:11 PM
 * @Created by wangruiyang
 */
public class ThreadTest14 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {

    }
}
class BakDateThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println(Thread.currentThread().getName() + "--->" + (++i));
        }
    }
}
