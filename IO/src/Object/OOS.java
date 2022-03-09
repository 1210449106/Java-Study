package Object;

import java.io.*;

/*
 * @ClassName: OOS
 * @Description:ObjectOutputStream将对象写入文件
 * @author: wry
 * @date: 2021/11/24  14:40
 */
public class OOS {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("d:" + File.separator +
                "test" + File.separator + "test")));
        oos.writeObject("Hello World");
        oos.close();
    }
}