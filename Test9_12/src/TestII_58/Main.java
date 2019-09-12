package TestII_58;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] setCookie = new int[n];
            int count = 1;
            for(int i = 0;i < n;i++){
                arr[i] = in.nextInt();
            }
            if(arr[0]>arr[1]){
                setCookie[0] = 2;
                setCookie[1] = 1;
            }else if(arr[0]<arr[1]){
                setCookie[0] = 1;
                setCookie[1] = 2;
            }else {
                setCookie[0] = 1;
                setCookie[1] = 1;
            }
            if(arr[n-1]>arr[n-2]){
                setCookie[n-1] = 2;
                setCookie[n-2] = 1;
            }else if(arr[n-1]<arr[n-2]){
                setCookie[n-1] = 1;
                setCookie[n-2] = 2;
            }else {
                setCookie[n-1] = 1;
                setCookie[n-2] = 1;
            }
            for(int j = 2;j < n-2;j++){
                if((arr[j]>arr[j-1])&&(arr[j]>arr[j-1])){
                    setCookie[j] = Math.max(setCookie[j-1],setCookie[j+1])+1;
                }else if((arr[j]<arr[j-1])&&(arr[j]<arr[j-1])){
                    setCookie[j] = Math.min(Math.min(setCookie[j-1],setCookie[j+1])-1,1)+1;
                }else{
                    setCookie[j] = setCookie[j-1];
                }
            }
            for(int m = 0;m<n;m++){
                count+=setCookie[m];
            }
            System.out.println(count);
        }
    }
}
