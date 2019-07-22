package Day40;
//牛客#句子逆序
import java.util.Scanner;

public class Main40_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        int i = str.length()-1;
        int j = str.length();
        while(i>=0){

            if(str.charAt(i)==' '){
                str2.append(str.substring(i,j));
                j=i;
            }
            i--;

        }
        str2.append(' ');
        str2.append(str.substring(0,j));
        String str3 = new String(str2);


        System.out.println(str3.trim());
    }
}
