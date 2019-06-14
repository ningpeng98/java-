package Day19;
//牛客#子串判断
import java.util.Arrays;

public class Main19_1 {
    public static void main(String[] args) {
        String[] str={"a","b","c","d"};
        int n =str.length;
        String str2="abc";
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(chkSubStr(str,n,str2)));
    }
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] q = new boolean[n];
        for(int i=0;i<n;i++){
            if(s.contains(p[i])){
                q[i]=true;
            }else{
                q[i]=false;
            }
        }
        return q;
    }
}
