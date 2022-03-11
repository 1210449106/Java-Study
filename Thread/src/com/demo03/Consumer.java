package com.demo03;

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
            for (int i = 1; i <= 10; i++) {//消费次数
                p.getProduct();
            }
    }//消费者线程

    public Consumer(Product p) {
        this.p = p;
    }
}
