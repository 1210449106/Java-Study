package com.Thread.Thread01;

/**
 * @Classname : Test
 * @Description :
 * @Date : 2022/2/5 2:53 PM
 * @Created by wangruiyang
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        Thread.currentThread().setName("main1");
        Thread t1 = new Thread("Thread1");
        t1.run();
        for (int i = 0;i <= 100;i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}
