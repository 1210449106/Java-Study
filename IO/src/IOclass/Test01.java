package IOclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * @ClassName: Test01
 * @Description: 序列化自定义对象 内存==》文件
 * @author: wry
 * @date: 2021/11/24  14:53
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Person ps = new Person("张三",14,"男");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:" + File.separator +
                "test" + File.separator + "test")));
        oos.writeObject(ps);
        oos.close();
    }
}