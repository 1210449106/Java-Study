package com.wry.Test;

import com.wry.Calculator.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Classname : CalculatorTest
 * @Description :
 * @Date : 2022/3/16 7:25 PM
 * @Created by wangruiyang
 */
public class CalculatorTest {
//
    @Before
    public void before(){
        System.out.println("测试开始");
    }
//
    @After
    public void after(){
        System.out.println("测试结束");
    }
//    测试add方法
    @Test
    public void testAdd(){
        System.out.println("测试add方法");
        Calculator cal = new Calculator();
        int result = cal.add(10, 20);
//        加入断言 预测一下结果
        Assert.assertEquals(40,result);//Assert.assertEquals(预测结果,实际结果)
    }
//    测试sub方法
    @Test
    public void testSub(){
        System.out.println("测试Sub方法");
        Calculator cal = new Calculator();
        System.out.println(cal.sub(20, 10));
    }
}
