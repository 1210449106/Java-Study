package com.wry.test02;

/**
 * @Classname : Student
 * @Description :Student作为子类
 * @Date : 2022/3/23 3:04 PM
 * @Created by wangruiyang
 */
@MyAnnotation("Hello")
public class Student extends Person implements MyInterface{
//    属性
    private int sno;//学号
    double height;//身高
    protected double weight;//体重
    public double score;//成绩
//    方法
    @MyAnnotation("Word")
    public String showInfo(){
        return "我是一名三好学生";
    }
    public String showInfo(int a,int b){
        return "我是一名三好学生";
    }
    private void work(){
        System.out.println("我以后会找工作");
    }
    void happy(){
        System.out.println("做人最重要的是开心");
    }
    protected int getSno(){
        return sno;
    }
//    构造器
    public Student(){
        System.out.println("空参构造器");
    }
    public Student(double weight,double height){
        this.weight = weight;
        this.height = height;
    }
    private Student(int sno){
        this.sno = sno;
    }
    Student(int sno,double weight){
        this.sno = sno;
        this.weight = weight;
    }
    protected Student(int sno,double weight,double height){
        this.sno = sno;
        this.weight = weight;
        this.height = height;
    }

    @Override
    @MyAnnotation("Hello MyMethoed")
    public void myMethod() throws RuntimeException{
        System.out.println("重写后的myMethod方法");
    }
//    toString

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}