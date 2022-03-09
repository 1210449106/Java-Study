package com.strick.Strick01;

/**
 * @Classname : BuyTicketThread
 * @Description :
 * @Date : 2022/2/5 4:21 PM
 * @Created by wangruiyang
 */
public class BuyTicketThread extends Thread{
    static int ticketNum = 1000;
    @Override
    public void run() {
        while (ticketNum > 0) {
            System.out.println("我在"+this.getName()+"买到了第" + ticketNum-- +"张车票");
        }
    }
//    构造方法
    public BuyTicketThread() {
    }

    public BuyTicketThread(String name) {
        super(name);
    }
}
