package Day40;
//牛客#删除公共字符
import java.util.Scanner;
public class Main40_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuilder str3 = new StringBuilder();
        for(int i = 0;i<str1.length();i++){
            char c = str1.charAt(i);
            for(int j = 0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    c='*';
                }
            }
            str3.append(c);
            for(int m = 0;m<str3.length();m++){
                if(str3.charAt(m)=='*'){
                    str3.deleteCharAt(m);
                }
            }
        }
        System.out.println(str3);
    }
}
