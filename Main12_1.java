package Day12;
//不创建新变量进行两个数交换的两种方法
import java.util.*;
public class Main12_1 {
    public static void main(String[] args) {
        int[] AB=new int[]{0,2};
        System.out.println(Arrays.toString(AB));
        exchangeAB(AB);
        System.out.println(Arrays.toString(AB));
        exchangeAB2(AB);
        System.out.println(Arrays.toString(AB));
    }



    public static int[] exchangeAB(int[] AB) {
        AB[0]=AB[0]+AB[1];
        AB[1]=AB[0]-AB[1];
        AB[0]=AB[0]-AB[1];
        return AB;
    }
    public static int[] exchangeAB2(int[] AB) {
        AB[0]=AB[0]^AB[1];
        AB[1]=AB[0]^AB[1];
        AB[0]=AB[0]^AB[1];
        return AB;
    }

}
