package com.wry.test02;

import java.lang.annotation.Annotation;

/**
 * @Classname : Test04
 * @Description :
 * @Date : 2022/3/24 3:16 PM
 * @Created by wangruiyang
 */
public class Test04 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws ClassNotFoundException {
//        获取字节码信息
        Class cls = Class.forName("com.wry.test02.Student");
//        .getInterfaces()获取运行时类的接口
        Class[] interfaces = cls.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);
        }
//        .getSuperclass()获取父类的字节码信息
        Class superclass = cls.getSuperclass();
//        .getPackage()获取所在包
        Package aPackage = cls.getPackage();
        System.out.println(aPackage.getName());
//        .getAnnotations()获取运行时类的注解
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a);
        }
    }
}
