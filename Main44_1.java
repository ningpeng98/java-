package Day44;
//牛客#骆驼命名法
import java.util.Scanner;
public class Main44_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            StringBuilder str2 = new StringBuilder();
            for(int i = 0;i<str1.length();i++){
                if(str1.charAt(i) == '_'){
                    str2.append((char)(str1.charAt(i+1)-32));
                    i++;
                }else{
                    str2.append(str1.charAt(i));
                }
            }
            System.out.println(str2);
        }
    }
}