package Data;

import java.io.*;

/*
 * @ClassName: Test
 * @Description:
 *              DataOutputStream 将内存中变量写出到文件中
 * @author: wry
 * @date: 2021/11/16  15:31
 */
public class Test {
    public static void main(String[] args) throws IOException {
        int a = 123;
        double b = 1.34;
        String str = "adws";
//        DataOutputStream 将内存(程序)中变量写出到文件中
        File f = new File("d:" + File.separator + "test" + File.separator + "test");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
        dos.writeInt(a);
        dos.writeDouble(b);
        dos.writeUTF(str);
//        关闭
        dos.close();
    }
}