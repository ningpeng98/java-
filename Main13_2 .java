package Day13;
//牛客#用指定字符组成一个指定边长的正方形。
import java.util.Scanner;

public class Main12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int sub =0;
        String c =sc.next();
        if(l%2!=0){
            sub=l/2+1;
        }else{
            sub=l/2;
        }
        for(int i=1;i<=sub;i++){
            if(i==1||i==sub){
                for(int j=1;j<=l;j++){
                    System.out.print(c);
                }
                System.out.print("\n");
            }else{
                System.out.print(c);
                for(int j=1;j<=l-2;j++){
                    System.out.print(" ");
                }
                System.out.print(c);
                System.out.print("\n");

            }

        }
    }
}
