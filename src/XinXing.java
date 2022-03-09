/*
 * @ClassName: XinXing
 * @Description:
 * @author: wry
 * @date: 2021/11/28  13:54
 */
public class XinXing {
    public static void main(String[] args) {
            for(float y = (float) 1.5;y>-1.5;y -=0.1)  {
                for(float x= (float) -1.5;x<1.5;x+= 0.05){
                    float a = x*x+y*y-1;
                    if((a*a*a-x*x*y*y*y)<=0.0)  {
                        System.out.print("^");
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
    }
}