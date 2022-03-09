package IOclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * @ClassName: Test02
 * @Description:ObjectInputStream 自定义对象反序列化 文件==>内存
 * @author: wry
 * @date: 2021/11/24  15:00
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:" + File.separator +
                "test" + File.separator + "test")));
        Person p = (Person)ois.readObject();
        System.out.println(p);
        ois.close();
    }
}