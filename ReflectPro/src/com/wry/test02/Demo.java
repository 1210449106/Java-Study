package com.wry.test02;

/**
 * @Classname : Demo
 * @Description :
 * @Date : 2022/3/23 7:43 PM
 * @Created by wangruiyang
 */
public class Demo {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        Class c1 = Person.class;
        Class c2 = Comparable.class;
        Class c3 = Override.class;
        int[] array1 = {1,2,3};
        Class c4 = array1.getClass();
        int[] array2 = {4,5,6};
        Class c5 = array2.getClass();
        System.out.println(c4 == c5);//结果:true 同一个维度，同一个元素类型，得到的字节码就是同一个，
        Class c6 = int.class;
        Class c7 = void.class;
    }
}
