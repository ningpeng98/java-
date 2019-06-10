package Day15;
//牛客#饥饿的小易
import java.util.Scanner;

public class Main15_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long begin = sc.nextLong();
        long time= 0;
        long result = 0;
        while(begin>=1&&time<100000){
            if(begin%1000000007==0){
                if(time%3==0){
                    System.out.println(time/3);
                } else{
                    System.out.println(time/3+1);
                }
                return;
            }
            begin = 2*begin+1;
            time++;
        }
        System.out.println(-1);
    }
}
