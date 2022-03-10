package com.demo01;

/**
 * @Classname : TestThread
 * @Description :
 * @Date : 2022/3/10 2:07 PM
 * @Created by wangruiyang
 */
public class TestThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
            if (i ==20){
                Thread.currentThread().stop();
            }
        }
    }
}
