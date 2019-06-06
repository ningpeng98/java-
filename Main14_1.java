package Day14;
//牛客#组个最小数
import java.util.Scanner;

public class Main14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int[] data = new int[10];
        int first = 1;
        for(int i=0;i<10;i++){
            int n=sc.nextInt();
            data[i]=n;
        }
        for(int j=1;j<10;j++){
            if(data[j]!=0){
                str.append(j);
                first = j;
                break;
            }
        }
        for(int x=0;x<=9;x++){
            if(x==first){
                lianjie(data[x]-1,x,str);
            }else{
                lianjie(data[x], x,str);
            }

        }


        System.out.println(str);


    }
    public static void lianjie(int n,int num,StringBuilder str){
        for(int i=0;i<n;i++){
            str.append(num);
        }

    }
}
