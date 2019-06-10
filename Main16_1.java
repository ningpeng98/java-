package Day16;
//牛客#洗牌
import java.util.Scanner;
public class Main16_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int sum = sc.nextInt();
            int time = sc.nextInt();
            int[] data = new int[2*sum];
            int[] data2 = new int[2*sum];
            for(int j=0;j<2*sum;j++){
                data[j]=sc.nextInt();
            }
            for(int x = 0;x<time;x++){
                int m1=0,n1=0,m2=sum,n2=1;
                while(m1<sum||n1<2*sum){
                    data2[n1]=data[m1];
                    m1++;
                    n1+=2;
                }
                while(m2<2*sum||n1<2*sum){
                    data2[n2]=data[m2];
                    m2++;
                    n2+=2;
                }
                for(int t=0;t<2*sum;t++){
                    data[t]=data2[t];
                }
            }
            for(int t=0;t<2*sum;t++){
                if(t==2*sum-1){
                    System.out.print(data2[t]);
                }else{
                    System.out.print(data2[t]+" ");
                }
            }
            if(i!=num-1){
                System.out.println();
            }
        }
    }
}
