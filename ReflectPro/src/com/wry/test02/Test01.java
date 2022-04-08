package com.wry.test02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Classname : Test01
 * @Description :获取构造器 创建对象
 * @Date : 2022/3/23 8:06 PM
 * @Created by wangruiyang
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        获取字节码信息
        Class cls = Class.forName("com.wry.test02.Student");
//        通过字节码信息获取构造器
//        .getConstructors()只能获取当前运行时类的被Public修饰的构造器
        Constructor[] c1 = cls.getConstructors();
        for (Constructor c : c1) {
            System.out.println(c);
        }
        System.out.println("-----------");
//        .getDeclaredConstructors():获取运行时的全部修饰符的构造器
        Constructor[] c2 = cls.getDeclaredConstructors();
        for (Constructor c : c2) {
            System.out.println(c);
        }
        System.out.println("-----------");
//        .getConstructor()获取指定构造器
        Constructor con1 = cls.getConstructor();
        System.out.println(con1);//得到空构造器
        System.out.println("----------");
//        .getConstructor()得到两个参数的有参构造器
        Constructor con2 = cls.getConstructor(double.class, double.class);
//        .getDeclaredConstructor()得到被private修饰一个参数的有参构造器
        Constructor con3 = cls.getDeclaredConstructor(int.class);
        System.out.println(con3);
//        有了构造器以后创建对象
        Object o1 = con1.newInstance();
        System.out.println(o1);
        Object o2 = con2.newInstance(123.1,123.1);
        System.out.println(o2);
    }
}
