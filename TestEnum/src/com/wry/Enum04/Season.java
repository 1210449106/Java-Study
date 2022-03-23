package com.wry.Enum04;

/**
 * @Classname : Season
 * @Description :
 * @Date : 2022/3/22 7:29 PM
 * @Created by wangruiyang
 */
public enum Season implements TestInterface{
    SPRING{
        @Override
        public void show() {
            System.out.println("这是SPRING");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTOM{
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };
}
