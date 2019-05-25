package Day4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char del;
        for(int i = 0;i<str2.length();i++){
            del = str2.charAt(i);
            str1=DelChar(str1,del);
        }
        System.out.println(str1);
    }
    public static String DelChar(String str, char c){
        String result = "";

        for(int i=0;i<str.length();i++){
            if (str.charAt(i) != c) {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
