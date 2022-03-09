package com.Runable;

/**
 * @Classname : TestThread
 * @Description :
 * @Date : 2022/2/9 10:55 AM
 * @Created by wangruiyang
 */
public class TestThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
