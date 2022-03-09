package Object;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * @ClassName: OIS
 * @Description:ObjectInputStream 把对象从文件写入内存
 * @author: wry
 * @date: 2021/11/24  14:45
 */
public class OIS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:" + File.separator +"test"
                + File.separator + "test")));
        String str = (String) ois.readObject();
        System.out.println(str);
    }
}