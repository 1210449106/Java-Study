package com.strick.strick06;

/**
 * @Classname : BuyStickThread
 * @Description :
 * @Date : 2022/3/10 2:59 PM
 * @Created by wangruiyang
 */
public class BuyStickThread extends Thread{
    static int strick =10;
    @Override
    public void run() {
        buyStrick();
    }
//    买票方法
    public static synchronized void buyStrick(){//锁住的是 同步监视器：BuyStickThread.class
        while (strick > 0) {
            System.out.println("我在"+Thread.currentThread().getName()+"买到了第"+strick--+"张票");
        }
    }
//    构造方法
    public BuyStickThread() {
    }
    public BuyStickThread(String name) {
        super(name);
    }
}
