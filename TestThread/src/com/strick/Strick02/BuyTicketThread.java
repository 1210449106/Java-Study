package com.strick.Strick02;

import sun.security.krb5.internal.Ticket;

/**
 * @Classname : BuyTicketThread
 * @Description :
 * @Date : 2022/3/9 6:12 PM
 * @Created by wangruiyang
 */
public class BuyTicketThread implements Runnable{
    int Ticket = 100;
    @Override
    public void run() {
        while (Ticket >= 0){
            System.out.println("在"+Thread.currentThread().getName()+"抢到了第"+(Ticket--)+"张票");
        }
    }
}
