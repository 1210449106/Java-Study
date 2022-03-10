package com.strick.Strick05;

/**
 * @Classname : BuyStrickThread
 * @Description :
 * @Date : 2022/3/10 2:48 PM
 * @Created by wangruiyang
 */
public class BuyStrickThread implements Runnable{
    int strick=10000;
    @Override
    public void run() {
        buyTicket();
    }
    public synchronized void buyTicket(){//锁住的是this
        while (strick > 0) {
            System.out.println("我在"+Thread.currentThread().getName()+"买到了第"+strick--+"张票");
        }
    }
}
