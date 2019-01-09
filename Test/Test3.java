//w[17] = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2}
//v[11] = {010,000,0x0,090,080,070,060,050,040,030,020}

import java.util.*;
public class Test3 {
    public static void main(String[] args){
        int sum=0;
        int a=1;
        int[] w = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[] y = {'1','0','x','9','8','7','6','5','4','3','2'};
        while(a != 0){
            System.out.println("输入身份证号码前17位：");
            Scanner N = new Scanner(System.in);
            String num = N.nextLine();
            if(num.length() != 17){
                System.out.println("数字长度不足17位");
            }else{
                char [] tmp = num.toCharArray();
            for(int j = 0; j < 17; j++){
              if( tmp[j] > '9' && tmp[j] > '0'){
                int number = Integer.parseInt(String.valueOf(tmp[j]));
                sum += number*w[j];
                sum = sum%11;
                System.out.println("校验位为：");
                System.out.println(y[sum]);   
              }
		  }
        }else{
            System.out.println("输入不全为数字");
        }  
        }
    }
}
  