package Day26;
//牛客#数字之和
import java.util.Scanner;
public class Main26_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            int input2 = input*input;
            System.out.println(result(input)+" "+result(input2));
        }

    }
    public static int result(int input){
        int sum = 0;
        while(input!=0){
            sum += input%10;
            input=input/10;
        }
        return sum;
    }
}
