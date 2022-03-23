package com.wry.Enum02;

/**
 * @Classname : Season
 * @Description :定义枚举类：季节
 * @Date : 2022/3/19 5:40 PM
 * @Created by wangruiyang
 */
public enum Season {
    //提供枚举类的有限的 确定的对象:==>Enum枚举类要求对象（常量）必须放在最开始的位置上
    //不同对象之间用,分割 最后用；结束
    SPRING("春天","春暖花开"),
    SUMMER("夏天","雷日炎炎"),
    AUTUM("秋天","硕果累累"),
    WINTER("冬天","冰天雪地");
    private final String seasonName;//季节名字
    private final String seasonDesc;//季节描述

//    利用构造器传值
    private Season(String seasonName, String seasonDesc) {//构造器私有化 外界不能调用这个构造器，只能Season自己调用
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
//    额外因素

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
//    toString

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
