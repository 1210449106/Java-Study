package com.demo03;

/**
 * @Classname : Test
 * @Description :同步方法 线程通信
 * @Date : 2022/3/10 6:48 PM
 * @Created by wangruiyang
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
//        创建共享商品
        Product p = new Product();
//        创建生产者
        Producer pt = new Producer(p);
        Thread pt1 = new Thread(pt);
//        创建消费者
        Consumer cs = new Consumer(p);
        Thread cs1 = new Thread(cs);
        pt1.start();
        cs1.start();
    }
}
