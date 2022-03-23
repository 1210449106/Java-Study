package com.wry.Enum04;

/**
 * @Classname : TestEnum
 * @Description :
 * @Date : 2022/3/22 7:52 PM
 * @Created by wangruiyang
 */
public class TestEnum {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        spring.show();
        Season.SUMMER.show();
    }
}
