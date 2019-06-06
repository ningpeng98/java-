package Day14;
//牛客#尼科彻斯定理
import java.util.Scanner;

public class Main14_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuilder str = new StringBuilder();
            int m = sc.nextInt();

            int n = m*m;
            int first = 0;
            if(n%2!=0){
                first = n-((m/2)*2);
                lianjie(first,m,str);
            }else{
                first = n-((m/2)*2-1);
                lianjie(first,m,str);
            }
            System.out.println(str);

        }

    }
    public static void lianjie(int first,int m,StringBuilder str){
        while(m!=0){
            if(m==1){
                str.append(first);
                first+=2;
                m--;
            }
            else{
                str.append(first+"+");
                first+=2;
                m--;
            }
        }
    }
}
