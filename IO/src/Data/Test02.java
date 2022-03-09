package Data;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * @ClassName: Test02
 * @Description: DataInputStream 将文件中存储的基本数据类型和字符串写入内存变量中
 * @author: wry
 * @date: 2021/11/16  15:39
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("d:" + File.separator + "test" + File.separator + "test")));
        System.out.println("UTF"+dis.readUTF());
        System.out.println("Double"+dis.readDouble());
        System.out.println("UTF"+dis.readUTF());
        dis.close();
    }
}