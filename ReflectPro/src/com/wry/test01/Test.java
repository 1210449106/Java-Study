package com.wry.test01;

/**
 * @Classname : Test
 * @Description :
 * @Date : 2022/3/22 8:17 PM
 * @Created by wangruiyang
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
//        定义一个字符串，用来模拟前台的支付方式
        String str = "微信";
        if ("微信".equals(str)){
            //        微信支付：
            pay(new WeChat());
        }
        if ("支付宝".equals(str)){
            //        支付宝支付：
            pay(new AliPay());
        }
        if("银行卡".equals(str)){
            pay(new BankCard());
        }
    }
    public static void pay(Mtwm pay){
        pay.payOnline();
    }
}
