package Day41;
//牛客#连续最大和
import java.util.Scanner;

public class Main41_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int maxNum = arr[0];
        for(int i = 1;i<n;i++){
            max = (max>0)?max+arr[i]:max;
            maxNum = (max < maxNum)?maxNum:max;
        }
        System.out.println(maxNum);
    }
}
