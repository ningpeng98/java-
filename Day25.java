package Day25;//牛客#学分绩点
import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = 0;
        int num = 0;
        int[] data0 = new int[n];
        double[] data = new double[n];
        double[] data2 = new double[n];
        for(int i=0;i<n;i++){
            data0[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            num=sc.nextInt();
            if(num>=90&&num<=100) {
                data[i] = 4.0;
            }
            if(num>=85&&num<=89) {
                data[i] = 3.7;
            }
            if(num>=82&&num<=84) {
                data[i] = 3.3;
            }
            if(num>=78&&num<=81) {
                data[i] = 3.0;
            }
            if(num>=75&&num<=77) {
                data[i] = 2.7;
            }
            if(num>=72&&num<=74) {
                data[i] = 2.3;
            }
            if(num>=68&&num<=71) {
                data[i] = 2.0;
            }
            if(num>=64&&num<=67) {
                data[i] = 1.5;
            }
            if(num>=60&&num<=63) {
                data[i] = 1.0;
            }
            if(num<60){
                data[i] = 0.0;
            }
        }
        double y = 0.0;
        int m = 0;
        for(int i=0;i<n;i++){
            y += data0[i]*data[i];
            m += data0[i];
        }
        System.out.println(String.format("%.2f", (y/m)));
    }
}
