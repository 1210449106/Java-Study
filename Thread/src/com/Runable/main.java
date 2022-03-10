package com.Runable;

/**
 * @Classname : main
 * @Description :
 * @Date : 2022/2/9 10:56 AM
 * @Created by wangruiyang
 */
public class main {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        TestThread tt = new TestThread();
        Thread t1 = new Thread(tt,"Thread01");
        Thread t2 = new Thread(tt,"Thread02");
        Thread t3 = new Thread(tt,"Thread03");
        t1.start();
        t2.start();
        t3.start();
    }
}
