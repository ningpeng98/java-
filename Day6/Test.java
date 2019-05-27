package Day6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] arr = new int[strs.length];
            for(int i = 0;i<arr.length;i++){
                arr[i]=Integer.valueOf(strs[i]);

            }
            int num = arr[0];
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==num){
                    count++;
                }else if(count>0){
                    count--;

                }else{
                    num = arr[j];
                }

            }
            System.out.println(num);
        }

    }

}
