package com.strick.Strick03;

/**
 * @Classname : test
 * @Description :
 * @Date : 2022/3/10 3:02 PM
 * @Created by wangruiyang
 */
public class test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        BuyStickThread bst1 = new BuyStickThread("窗口1");
        BuyStickThread bst2 = new BuyStickThread("窗口2");
        BuyStickThread bst3 = new BuyStickThread("窗口3");
        bst1.start();
        bst2.start();
        bst3.start();
    }
}
