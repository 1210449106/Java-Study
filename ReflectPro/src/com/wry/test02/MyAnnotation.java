package com.wry.test02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @Classname : MyAnnotation
 * @Description :
 * @Date : 2022/3/23 8:00 PM
 * @Created by wangruiyang
 */
/*
@Target:定义当前注解能够修饰程序中哪些元素
@Retention：定义注解的生命周期
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();//属性
}