package com.wry.test02;

import java.io.Serializable;

/**
 * @Classname : Person
 * @Description :
 * @Date : 2022/3/23 3:03 PM
 * @Created by wangruiyang
 */
//作为一个父类
public class Person implements Serializable {
    private int age;
    public String name;
    private void eat(){
        System.out.println("Person----eat");
    }
    public void sleep(){
        System.out.println("Person----sleep");
    }
}
