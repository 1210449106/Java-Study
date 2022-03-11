package com.strick.Strick08;

/**
 * @Classname : test
 * @Description :
 * @Date : 2022/3/10 3:02 PM
 * @Created by wangruiyang
 */
public class test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        BuyStickThread bst = new BuyStickThread();
        Thread t1 = new Thread(bst, "窗口1");
        Thread t2 = new Thread(bst, "窗口2");
        Thread t3 = new Thread(bst, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
