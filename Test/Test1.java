//100个66位密码
//1,3,5位为数字，2,4,6位为大写字母
//存储到文件中
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

public class Test1 {
    public static void main(String[] args){
        InitPassword();
        //InitFile();
    }
    public static void InitPassword(){
        for (int i = 1; i <= 100; i++) {
            System.out.printf("Password-"+i+":");
            for (int j = 1; j <= 6; j++) {
                double rand = Math.random();
                if (j%2==1) {
                    System.out.print((char) (rand * ('9' - '0') +'0'));
                } else {
                    System.out.print((char) (rand * ('Z' - 'A') +'A'));
                } 

            }
            System.out.println();
        }
    }  
}
    
