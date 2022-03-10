package com.demo01;

/**
 * @Classname : test
 * @Description :
 * @Date : 2022/3/10 2:08 PM
 * @Created by wangruiyang
 */
public class test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws InterruptedException {
        TestThread tt = new TestThread();
        Thread t1 = new Thread(tt, "线程1");
        Thread t2 = new Thread(tt, "线程2");
        for (int i = 0; i < 10; i++) {
            System.out.println("main----"+i);
            if (i == 6){
                t1.start();
                t1.join();
                t2.setDaemon(true);
                t2.start();
            }
        }
    }
}
