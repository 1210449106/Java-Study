package com.strick.strick04;

/**
 * @Classname : BugStrickThread
 * @Description :
 * @Date : 2022/3/10 2:48 PM
 * @Created by wangruiyang
 */
public class BugStrickThread implements Runnable{
    int strick=10;
    @Override
    public void run() {
        while (strick > 0) {
                System.out.println("我在"+Thread.currentThread().getName()+"买到了第"+strick--+"张票");
        }
    }
}
