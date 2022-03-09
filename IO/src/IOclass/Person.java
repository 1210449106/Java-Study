package IOclass;

import java.io.Serializable;

/*
 * @ClassName: Person
 * @Description:
 * @author: wry
 * @date: 2021/11/24  14:52
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -8497543619894311847L;
    private String name;
    private int age;
    private String sex;
//构造方法
    public Person() {
    }
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //Setter and Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
//    tostring

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}