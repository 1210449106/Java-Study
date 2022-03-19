package com.wry.anno02;

import java.util.ArrayList;

/**
 * @Classname : Test
 * @Description :
 * @Date : 2022/3/17 1:42 PM
 * @Created by wangruiyang
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int age = 10;
        @SuppressWarnings({"unused","rwatypes"})
        ArrayList<String> al = new ArrayList();
    }
}
