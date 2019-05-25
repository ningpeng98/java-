package Day4;
//8个装或6个装

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
        System.out.println(PackageNum(apple));
    }
    public static int PackageNum(int apple){
        int num = 0;
        int min = apple;
        for(int a=0;a<=apple/6;a++){
            for(int b=0;b<=apple/6;b++){
                if((a*8+b*6)==apple){
                    num = a+b;
                    if(num<=min){
                        min = num;
                    }
                }
            }

        }
        if(min != apple)
            return min;
        else
            return -1;

    }
}
