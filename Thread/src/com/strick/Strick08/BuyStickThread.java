package com.strick.Strick08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname : BuyStickThread
 * @Description :
 * @Date : 2022/3/10 2:59 PM
 * @Created by wangruiyang
 */
public class BuyStickThread implements Runnable{
    static int strick =10;
//    新建锁
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
//        打开线程锁
        lock.lock();
        try {
            while (strick > 0) {
                System.out.println("我在" + Thread.currentThread().getName() + "买到了第" + strick-- + "张票");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//        关闭线程锁==》有异常也可以释放
            lock.unlock();
        }
    }
}
