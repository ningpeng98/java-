package Day9;
//牛客：末尾0的个数
//输入一个n（0<=n<=1000）,求n!末尾的0的个数，直接求n的阶乘然后找0的做法行不通
//需要转换思路，寻找0-n的数字中质因数中5的个数
import java.util.Scanner;

public class Main9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int  n = sc.nextInt();
        for(int i=n;i>=5;i--){
            int tmp=i;
            while(tmp%5==0){
                count++;
                tmp=tmp/5;
            }
        }

        System.out.println(count);
    }

}

