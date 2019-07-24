package Day42;
//牛客#计算日期到天数转换
import java.util.Scanner;
public class Main42_2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNext()){
            int[] mon = {31,0,31,30,31,30,31,31,30,31,30,31};
            int count = 0;
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            if((year%4==0&&year%100!=0)||(year%400==0)){
                mon[1]=29;
            }else{
                mon[1]=28;
            }
            if(month == 1){
                System.out.println(day);
            }
            else{
                for(int i = 1;i<month;i++){
                    count+=mon[i-1];
                }
                count+=day;
                System.out.println(count);
            }
        }
    }
}
