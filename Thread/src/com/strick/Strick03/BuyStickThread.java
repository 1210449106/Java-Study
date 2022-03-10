package com.strick.Strick03;

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
        synchronized (this){
            while (strick > 0) {
                System.out.println("我在"+Thread.currentThread().getName()+"买到了第"+strick--+"张票");
            }
        }
    }
//    构造方法
    public BuyStickThread() {
    }
    public BuyStickThread(String name) {
        super(name);
    }
}
