package TestI_58;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            int count = 1;
            String[] arr = str.split(",");
            for(int i = 0;i<arr.length-1;i++){
                if(!(arr[i+1].equals(arr[i]))){
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
