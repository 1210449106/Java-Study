package com.demo05;

/**
 * @Classname : Consumer
 * @Description :
 * @Date : 2022/3/10 6:36 PM
 * @Created by wangruiyang
 */
public class Consumer implements Runnable{
    private Product p;
    @Override
    public void run() {
        synchronized (p){
            for (int i = 1; i < 10; i++) {//消费次数
                System.out.println("消费者消费了"+p.getBrand()+"----"+p.getName());
            }
        }
    }//消费者线程

    public Consumer(Product p) {
        this.p = p;
    }
}
