package com.wry.Enum05;

/**
 * @Classname : Person
 * @Description :
 * @Date : 2022/3/22 7:58 PM
 * @Created by wangruiyang
 */
public class Person {
    private int age;
    private String name;
    private Gender sex;
//    setter and getter


    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    toString

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
