package Day21;
//牛客#最难的问题-破译密文
import java.util.Scanner;
public class Main21_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine();
            char[] data = str1.toCharArray();
            for(int i=0;i<data.length;i++){
                char c = data[i];
                if(c>='A'){
                    if(c>'E'){
                        c=(char)(c-5);
                    }else{
                        c=(char)(c+21);
                    }
                }
                data[i]=c;
            }
            System.out.println(new String(data));
        }
    }
}
