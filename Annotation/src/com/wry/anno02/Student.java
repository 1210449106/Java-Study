package com.wry.anno02;

/**
 * @Classname : Student
 * @Description :
 * @Date : 2022/3/17 1:38 PM
 * @Created by wangruiyang
 */
public class Student extends Person{
    /*
    @Override 限定重写的方法 只要重写方法有问题，就有错误提示
     */
    public void eat(){

    }
    @Deprecated
    public void study(){
        System.out.println("学习");
    }
}
