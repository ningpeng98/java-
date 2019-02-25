//java猜数字游戏
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        int number = (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("输入数字（1-100）");
            int guess = input.nextInt();

            if(guess == number){
                System.out.println("猜对了!\n"+"number = "+number);
                return;
            }else if(guess < number){
                System.out.println("猜小了");
            }else{
                System.out.println("猜大了");
            }
    

        }

    }
}