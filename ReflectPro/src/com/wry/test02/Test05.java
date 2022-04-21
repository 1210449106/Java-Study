package com.wry.test02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Classname : Test05
 * @Description :
 * @Date : 2022/4/21 3:47 PM
 * @Created by wangruiyang
 */
public class Test05 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws IOException {
        //获取配置文件
        //Thread.currentThread() 当前线程对象
        //getContextClassLoader()是线程对象的方法，可以获取到当前线程的类加载器对象
        //getResource()【获取资源】是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
        //获取配置文件路径
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        System.out.println(path);
        FileReader fr = new FileReader(path.toString());
        //创建类属性对象\
        Properties prop = new Properties();
        prop.load(fr);
        System.out.println(prop.getProperty("className"));
    }
}
