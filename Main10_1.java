package Day10;
//Fibonacci数列
import java.util.Scanner;
public class Main10_1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        int l=1;
        int r=1;
        while(r<n){
            f=l;
            l=r;
            r=f+l;
        }
        int count1=r-n;
        int count2=n-l;
        if(count1<=count2){
            System.out.println(count1);
        }
        else{
            System.out.println(count2);
        }
    }
}
