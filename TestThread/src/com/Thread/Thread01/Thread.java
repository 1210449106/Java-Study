package com.Thread.Thread01;

/**
 * @Classname : TestThread
 * @Description : Building TestThread
 * @Date : 2022/2/5 2:47 PM
 * @Created by wangruiyang
 */
public class Thread extends java.lang.Thread{
    @Override
    public void run() {
        for (int i = 0;i <= 100;i++) {
            System.out.println(this.getName()+"----"+i);
        }
    }
//    构造方法
    public Thread() {
    }
    public Thread(String name) {
        super(name);
    }
}