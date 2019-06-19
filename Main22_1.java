package Day22;
//牛客#到底买不买-买珠子
import java.util.Scanner;

public class Main22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int count = 0;
            String Seal = sc.nextLine();
            String Buy = sc.nextLine();
            char[] seals = Seal.toCharArray();
            char[] buys = Buy.toCharArray();
            for(int i=0;i<buys.length;i++){
                for(int j=0;j<seals.length;j++){
                    if(buys[i]==seals[j]){
                        count++;
                        seals[j]='-';
                        break;
                    }
                }
            }
            if(count==Buy.length()){
                System.out.println("yes"+" "+(Seal.length()-count));
            }else{
                System.out.println("No"+" "+(Buy.length()-count));
            }
        }
    }

}
