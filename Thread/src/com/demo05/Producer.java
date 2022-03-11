package com.demo05;

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
            for (int i = 1; i < 10; i++) {//生产10个商品
                if ( i%2 == 0){
                    //生产费列罗巧克力
                    p.setBrand("费列罗");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("巧克力");
                }
                else {
                    //生产哈尔滨啤酒
                    p.setBrand("哈尔滨");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("啤酒");
                }
//            打印产品信息
                System.out.println("生产者生产了"+p.getBrand()+"----"+p.getName());
            }
    }

    public Producer(Product p) {
        this.p = p;
    }
}
