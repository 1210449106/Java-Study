package com.strick.Strick01;

/**
 * @Classname : Test
 * @Description :
 * @Date : 2022/2/5 4:24 PM
 * @Created by wangruiyang
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        Thread tt1 = new BuyTicketThread("窗口1");
        Thread tt2 = new BuyTicketThread("窗口2");
        Thread tt3 = new BuyTicketThread("窗口3");
        tt1.start();
        tt2.start();
        tt3.start();
    }
}
