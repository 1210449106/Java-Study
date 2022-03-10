package com.strick.strick04;

/**
 * @Classname : test
 * @Description :
 * @Date : 2022/3/10 2:49 PM
 * @Created by wangruiyang
 */
public class test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws InterruptedException {
        BugStrickThread bst = new BugStrickThread();
        Thread tt1 = new Thread(bst, "窗口1");
        Thread tt2 = new Thread(bst, "窗口2");
        Thread tt3 = new Thread(bst, "窗口3");
        tt1.start();
        tt2.start();
        tt3.start();
    }
}
