package com.wry.anno;

/**
 * @Classname : Person
 * @Description :
 * @Date : 2022/3/17 1:14 PM
 * @Created by wangruiyang
 */
public class Person {
    /** 输入/** 回车 自动生成
     *下面是eat方法 实现了xxx
     * @param num1 就餐人数
     * @param num2 点了几个菜
     */
    public void eat(int num1,int num2){

    }

    /**
     *
     * @param age 年龄
     * @return int
     * @exception RuntimeException 当年龄过大时
     * @exception IndexOutOfBoundsException 当年龄过小时
     * @see Student
     */
    public int sleep(int age){
        if ( age > 100 ) {
            throw new RuntimeException();
        }
        if (age < 0){
            throw new IndexOutOfBoundsException();
        }
        return 10;
    }
}
