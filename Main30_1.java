package Day30;
//牛客#大整数排序
import java.math.BigInteger;
        import java.util.Arrays;
        import java.util.Scanner;

public class Main30_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            BigInteger[] arr = new BigInteger[n];
            for(int i = 0;i<n;i++){
                arr[i]=sc.nextBigInteger();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);

            }
        }

    }
}
