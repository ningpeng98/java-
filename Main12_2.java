package Day12;
//牛客#输出格雷码
import java.lang.reflect.Array;
import java.util.*;

public class Main12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(getGray(n)));
    }
    public static String[] getGray(int n) {
        String[] str=null;
        if(n==1){
            str=new String[]{"0","1"};
        }else{
            String[] str2 = getGray(n-1);
            str=new String[2*str2.length];
            for(int i=0;i<str2.length;i++){
                str[i]="0"+str2[i];
                str[str.length-1-i]="1"+str2[i];
            }
        }

        return str;
    }
}