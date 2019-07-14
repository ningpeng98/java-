package Day34;
//牛客#球的半径和体积
import java.util.Scanner;
import java.lang.Math;
public class Main34_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x0=sc.nextFloat();
        double y0=sc.nextFloat();
        double z0=sc.nextFloat();
        double x1=sc.nextFloat();
        double y1=sc.nextFloat();
        double z1=sc.nextFloat();
        double s1 = (x1-x0)*(x1-x0)+(y1-y0)*(y1-y0)+(z1-z0)*(z1-z0);
        double s2 = Math.sqrt(s1);
        System.out.printf("%.3f",s2);
        System.out.print(" ");
        double v = 4*Math.acos(-1)*Math.pow(s2, 3)/3;
        System.out.printf("%.3f",v);

    }

}
