package Day21;
//牛客#统计每个月兔子的总数
import java.util.*;
public class Main21_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s=Sub(m);
        System.out.println(Sub(m));
    }
    public static int Sub(int m){
        if(m<3){
            return 1;
        }else{
            return Sub(m-1)+Sub(m-2);
        }
    }
}