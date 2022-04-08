package com.wry.test02;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Classname : Test03
 * @Description :
 * @Date : 2022/3/24 2:37 PM
 * @Created by wangruiyang
 */
public class Test03 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//        获取字节码信息
        Class cls = Class.forName("com.wry.test02.Student");
//        .getMethods()运行时类和父类所有被public修饰的方法
        Method[] methods = cls.getMethods();
//        .getDeclaredMethods()获取运行时类中的所有方法
        Method[] declaredmethods = cls.getDeclaredMethods();
        for (Method dec:declaredmethods) {
            System.out.println(dec);
        }
//        .getMethod()获取被Public修饰的指定方法
        Method showInfo = cls.getMethod("showInfo");
        Method showInfo2 = cls.getMethod("showInfo", int.class, int.class);
//        .getDeclaredMethod()获取其他指定方法
        Method work = cls.getDeclaredMethod("work");
        /*
        获取方法的具体结构
        @注解
        修饰符 返回值类型 方法名（参数列表) throws xxxxx()
         */
        //.getName()获取方法名
        String name = showInfo.getName();
        //.getModifiers()获取修饰符
        int modifiers = showInfo.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        //.getReturnType()获取返回值类型
        Class returnType = work.getReturnType();
        System.out.println(returnType);
        //.getParameterTypes()获取参数列表
        Class[] parameterTypes = showInfo2.getParameterTypes();
        for (Class p : parameterTypes) {
            System.out.println(p);
        }
        //.getAnnotations()获取注解(只能获取运行时注解)
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a);
        }
        //.getExceptionTypes()获取异常
        Class[] exceptionTypes = myMethod.getExceptionTypes();
//        .invoke()方法的调用
        Student stu = (Student) cls.newInstance();
        myMethod.invoke(stu);//调用stu对象的myMethod方法
        showInfo2.invoke(stu, 12, 45);
    }
}
