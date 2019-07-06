package Day27;

import java.util.Scanner;

public class Main27_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(data[i]==m){
                System.out.println(i);
                break;
            }
            if(i==n-1){
                System.out.println("-1");
            }
        }
    }
}
