package Day7;
//牛客#不为2
import java.util.Scanner;

public class Main7_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int W=sc.nextInt();
        int[][] data = new int[N][W];
        int count = 0;
        for (int i = 0;i<N;i++){
            if(i%4==0||i%4==1){
                for(int j = 0;j<W;j++){
                    if(j%4==0||j%4==1){
                        data[i][j]=1;
                    }
                }
            }else{
                for(int j = 0;j<W;j++){
                    if(j%4==2||j%4==3){
                        data[i][j]=1;
                    }
                }
            }
        }
        for (int i =0;i<N;i++){
            for(int j=0;j<W;j++){
                if(data[i][j]==1)
                    count++;
            }
        }
        System.out.println(count);

    }
}
