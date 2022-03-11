package com.demo03;

/**
 * @Classname : Producer
 * @Description :
 * @Date : 2022/3/10 6:36 PM
 * @Created by wangruiyang
 */
public class Producer implements Runnable{//生产者
    private Product p;
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if(i%2 == 0){
                p.setProduct("费列罗","巧克力");
            }
            else {
                p.setProduct("哈尔滨","啤酒");
            }
        }
    }

    public Producer(Product p) {
        this.p = p;
    }
}
