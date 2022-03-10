package com.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Classname : main
 * @Description :
 * @Date : 2022/3/9 6:37 PM
 * @Created by wangruiyang
 */
public class main {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //定义给线程对象
        TestRandomNum trn = new TestRandomNum();
        FutureTask<TestRandomNum> ft = new FutureTask(trn);
        Thread t1 = new Thread(ft);
        Thread t2 = new Thread(ft);
        Thread t3 = new Thread(ft);
        t1.start();
        System.out.println(ft.get());
        t2.start();
        System.out.println(ft.get());
        t3.start();
        System.out.println(ft.get());
    }
}
