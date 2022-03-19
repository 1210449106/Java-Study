package com.wry.anno03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Classname : MyAnnotatioin3
 * @Description :
 * @Date : 2022/3/19 3:01 PM
 * @Created by wangruiyang
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotatioin3 {
    String value();
}