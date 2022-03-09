/*
 * @ClassName: Array
 * @Description:数组相关算法
 * @author: wry
 * @date: 2021/11/14  13:49
 */
public class Array {
    public static void main(String[] args) {
//        1.冒泡排序
        int [] Arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if (Arr[j] > Arr[j+1]){
                    Arr[j] += Arr[j+1];
                    Arr[j+1] = Arr[j] - Arr[j+1];
                    Arr[j] = Arr[j] - Arr[j+1];
                }
            }
            }
        for(int t :Arr)
            System.out.println(t);
    }
}