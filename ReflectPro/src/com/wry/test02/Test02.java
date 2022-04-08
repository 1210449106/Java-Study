package com.wry.test02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Classname : Test02
 * @Description :获取属性
 * @Date : 2022/3/24 1:58 PM
 * @Created by wangruiyang
 */
public class Test02 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
//        获取字节码信息
        Class cls = Class.forName("com.wry.test02.Student");
//        .getFields()获取当前运行时类和父类中被public修饰的所有属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
//        .getDeclaredFields()获取运行时类中所有属性.
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println("----"+f);
        }
//        .getField()获取被public修饰的指定属性
        Field score = cls.getField("score");
        System.out.println(score);
//        .getDeclaredField()获取任意指定属性
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);
//        属性的具体结构
//        .getModifiers()获取属性的修饰符
        int modifier = sno.getModifiers();
//        Modifier中查看修饰符代码
        String str2 = Modifier.toString(modifier);//Modifier.toString()转字符
        System.out.println(str2);//private
//        .getType()获取属性的数据类型
        Class type = sno.getType();
//        .getName()获取属性的名字
        String str = sno.getName();
//        给属性赋值（必须要有对象）
        Field sco = cls.getField("score");
        Student stu = (Student)cls.newInstance();
        sco.setInt(stu,48);
    }
}
