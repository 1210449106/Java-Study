package com.wry.Enum05;

/**
 * @Classname : Test02
 * @Description :
 * @Date : 2022/3/22 8:05 PM
 * @Created by wangruiyang
 */
public class Test02 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        Gender sex = Gender.男;
//        switch后面的()中传入枚举类型
//        int,byte,short,char,String,枚举
        switch (sex){
            case 男:
                System.out.println("男");
                break;
            case 女:
                System.out.println("女");
                break;
        }
    }
}
