package com.demo04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname : Product
 * @Description :
 * @Date : 2022/3/10 6:37 PM
 * @Created by wangruiyang
 */
public class Product {//商品类
    private String brand;//品牌
    private String name;//产品名
    private Boolean flag = false;//产品就绪状态
//    声明一个Lock锁
    Lock lock = new ReentrantLock();
//    生产者等待队列
    Condition produceCondition = lock.newCondition();
//    消费者等待队列
    Condition consumCondition = lock.newCondition();
//    Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    生产商品方法
    public void setProduct(String brand,String name){
        lock.lock();
        try {
            if (flag){//产品已就绪 进入等待
                try {
//                    生产者进入等待队列
                    produceCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//        产品未就绪 进入生产
            //生产费列罗巧克力
            this.setBrand(brand);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
//            打印产品信息
            System.out.println("生产者生产了"+this.getBrand()+"----"+this.getName());
            flag = true;
//            通知消费者线程
            consumCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
//    消费方法
    public void getProduct(){
        lock.lock();
        try {
            if (!flag){//产品未就绪 进入等待
                try {
//                    进入等待
                    consumCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//        打印产品信息
            System.out.println("消费者消费了"+this.getBrand()+"----"+this.getName());
            flag = false;
//            通知生产者生产
            produceCondition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}