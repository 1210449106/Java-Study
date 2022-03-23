package com.wry.test01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Classname : Demo
 * @Description :
 * 反射
 * @Date : 2022/3/23 1:54 PM
 * @Created by wangruiyang
 */
public class Demo {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws Exception {
        String str = "com.wry.teat01.WeChat";//字符串：实际上就是微信类的全限定路径
//        利用反射
        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getMethod("PayOnline");
        method.invoke(o);
    }
}