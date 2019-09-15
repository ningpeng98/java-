package Tset1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        int count = 0;
        for (int o = 0; o < n-2; o++) {
            for(int p = o+1;p < n-1;p++){
                for(int q =  p+1;q < n;q++){
                    if(arr[o]+arr[p]+arr[q] < k){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
