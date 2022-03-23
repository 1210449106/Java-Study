package com.wry.Enum01;

/**
 * @Classname : Season
 * @Description :定义枚举类：季节
 * @Date : 2022/3/19 5:40 PM
 * @Created by wangruiyang
 */
public class Season {
    private final String seasonName;//季节名字
    private final String seasonDesc;//季节描述
//    利用构造器传值
    private Season(String seasonName, String seasonDesc) {//构造器私有化 外界不能调用这个构造器，只能Season自己调用
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
//    提供枚举类的有限的 确认的对象
    public final static Season SPRING = new Season("春天","春暖花开");
    public final static Season SUMMER = new Season("夏天","烈日炎炎");
    public final static Season AUTUMN = new Season("秋天","硕果累累");
    public final static Season WINTER = new Season("冬天","冰天雪地");
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
