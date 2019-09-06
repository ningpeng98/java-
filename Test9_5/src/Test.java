import java.util.Scanner;

public class Test{
    static int leng = 0;
    static int oldT = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int S = sc.nextInt();
        int T = sc.nextInt();
        if(Run(M,S,T)){
            System.out.println("Yes");
            System.out.println(oldT-T);
        }else{
            System.out.println("No");
            System.out.println(leng);
        }
    }
    public static boolean Run(int M,int S,int T){
        oldT = T;
        while(S<0){
            if(M>=10){
                S-=(M/10)*50;
                T--;
            }else{
                M = (M%10)+4;
                T--;
            }
            if(T<0){
                leng = T*13;
                System.out.println("T:(NO)="+T);
                return false;

            }
        }
        System.out.println("T:(YES)="+T);
        return true;
    }
}

