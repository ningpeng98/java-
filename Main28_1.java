package Day28;

import java.util.Scanner;
//牛客#守形数
public class Main28_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(isShouxin(n)){
                System.out.println("Yes!");
            }
            else{
                System.out.println("No!");
            }
        }
    }
    public static boolean isShouxin(int n){
        int m = n*n;
        int x = 1;
        for(int i = 0;i<5;i++){
            if(m>x){
                x*=10;
            }
            else{
                x=x/10;
                break;
            }
        }
        int y = m%x;
        for(int i=0;i<4;i++){
            if(n==y){
                return true;
            }else{
                y=y/10;
            }
        }
        return false;
    }
}
