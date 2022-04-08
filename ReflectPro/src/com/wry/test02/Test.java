package com.wry.test02;

/**
 * @Classname : Test
 * @Description :获取字节码信息的四种方式
 * @Date : 2022/3/23 7:29 PM
 * @Created by wangruiyang
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws ClassNotFoundException {
//    案例：以Person的字节码信息为案例
//        方式1(不常用):通过getClass()方法获取
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);
//        方式2(不常用):通过内置class属性
        Class c2 = Person.class;
        System.out.println(c2);
//        方式3(最常用)：调用Class类提供的静态方法forName()
        Class c3 = Class.forName("con.wry.test02.Person");
//        方式4(了解技能点)：利用类的加载器
        ClassLoader loader = Test.class.getClassLoader();
        Class c4 = loader.loadClass("com.wry.test02.Person");
    }
}
