package com.Callable;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Classname : TestRandomNum
 * @Description :
 * @Date : 2022/3/9 6:33 PM
 * @Created by wangruiyang
 */
public class TestRandomNum implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);//返回10以内的随机数
    }
}
