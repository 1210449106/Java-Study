package com.strick.Strick02;

/**
 * @Classname : main
 * @Description :
 * @Date : 2022/3/9 6:20 PM
 * @Created by wangruiyang
 */
public class main {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        BuyTicketThread bt = new BuyTicketThread();
        Thread t1 = new Thread(bt,"窗口1");
        Thread t2 = new Thread(bt,"窗口2");
        Thread t3 = new Thread(bt,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
