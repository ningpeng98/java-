import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();
        boolean isLeapYear = 
        (year%4==0&&year%100!=0)||(year%400==0);
        System.out.println(isLeapYear);
    }
}