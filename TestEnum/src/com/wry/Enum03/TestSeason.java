package com.wry.Enum03;

/**
 * @Classname : TestSeason
 * @Description :
 * @Date : 2022/3/22 7:40 PM
 * @Created by wangruiyang
 */
public class TestSeason {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
//        用enum关键字床架的呢Season枚举类上面的父类是：java.lang.Enum,常用发发子类Season可以直接拿来用
//        toString()-->获取对象名字
        Season autum = Season.AUTOM;
        System.out.println(autum);
//        values 返回枚举类对象的数组
        Season[] values = Season.values();
        for (Season s:values) {
            System.out.println(s);
        }
//        valueOf() 通过对象名字获取枚举对象
//        注意：对象名字必须传正确,否则抛出异常
        Season spring = Season.valueOf("SPRING");
    }
}
