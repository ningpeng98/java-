package Day11;
//牛客#个位数统计：统计一个多位数中各个位的数字的数量
import java.util.Scanner;

public class Main11_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] data =  str.split("");
        for(int i=0;i<=9;i++){
            String s = String.valueOf(i);
            int count = 0;
            for(int j=0;j<data.length;j++){

                if(data[j].equals(s)){
                    count++;
                }
            }
            if(count!=0){
                System.out.println(i+":"+count);
            }

        }

    }
}
