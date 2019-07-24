package Day42;
//牛客#字符串加解密
import java.util.Scanner;

public class Main42_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String strin1 = sc.nextLine();
            String strin2 = sc.nextLine();
            StringBuilder strout1 = new StringBuilder();
            StringBuilder strout2 = new StringBuilder();
            for(int i = 0;i<strin1.length();i++){
                if(strin1.charAt(i)>='A'&&strin1.charAt(i)<='Y'){
                    strout1.append((char) (strin1.charAt(i)+33));
                }
                else if(strin1.charAt(i)>='a'&&strin1.charAt(i)<='y'){
                    strout1.append((char) (strin1.charAt(i)-31));
                }
                else if(strin1.charAt(i)>='0'&&strin1.charAt(i)<='8'){
                    strout1.append((char) (strin1.charAt(i)+1));
                }
                else if(strin1.charAt(i)=='9'){
                    strout1.append('0');
                }
                else if(strin1.charAt(i)=='z'){
                    strout1.append('A');
                }
                else if(strin1.charAt(i)=='Z'){
                    strout1.append('a');
                }
            }
            for (int j = 0; j < strin2.length(); j++) {
                if(strin2.charAt(j)>='B'&&strin2.charAt(j)<='Z'){
                    strout2.append((char) (strin2.charAt(j)+31));
                }
                else if(strin2.charAt(j)>='b'&&strin2.charAt(j)<='z'){
                    strout2.append((char) (strin2.charAt(j)-33));
                }
                else if(strin2.charAt(j)>='1'&&strin2.charAt(j)<='9'){
                    strout2.append((char) (strin2.charAt(j)-1));
                }
                else if(strin2.charAt(j)=='0'){
                    strout2.append('9');
                }
                else if(strin2.charAt(j)=='a'){
                    strout2.append('Z');
                }
                else if(strin2.charAt(j)=='A'){
                    strout2.append('z');
                }

            }
            System.out.println(strout1);
            System.out.println(strout2);
        }

    }
}
