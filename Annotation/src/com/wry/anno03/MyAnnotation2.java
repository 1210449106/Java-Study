package com.wry.anno03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Classname : MyAnnotation2
 * @Description :
 * @Date : 2022/3/17 2:11 PM
 * @Created by wangruiyang
 */
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation2 {
    String[] value();
}