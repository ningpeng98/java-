package Day7;
//牛客#寻找最大公约数
import java.util.Scanner;

public class Main7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int result = A*B;
        for(int i=1;i<=result;i++){
            if(i%A==0&&i%B==0){
                System.out.println(i);
                return;
            }
        }

    }



}
