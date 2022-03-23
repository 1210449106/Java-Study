package com.wry.Enum05;

/**
 * @Classname : Test
 * @Description :
 * @Date : 2022/3/22 7:59 PM
 * @Created by wangruiyang
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(19);
        p.setName("lili");
        p.setSex(Gender.男);//传入枚举类Gender的对象;-->在入口处对参数进行了限制
        System.out.println(p);
    }
}
