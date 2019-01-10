//w[17] = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2}
//v[11] = {010,000,0x0,090,080,070,060,050,040,030,020}

import java.util.*;
public class Test3 {
    public static void main(String[] args){
        int[] w = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[] v = {'1','0','x','9','8','7','6','5','4','3','2'};
        System.out.println("输入身份证号码前17位：");

        outer:
        while(true){
            int sum=0;
            Scanner N = new Scanner(System.in);
            String num = N.nextLine();
            //判断输入是否为17位
            if(num.length() != 17){
                System.out.println("数字长度不为17位,请重新输入：");
                continue ;
            }
            //字符串转换为字符数组
            char [] Mas = num.toCharArray();
            for(int j = 0; j < 17; j++){
                int m=j+1;
                //判断输入是否为纯数字
              if( Mas[j] > '9' || Mas[j] < '0'){
                System.out.println("输入不全为数字，请重新输入:"+"(第"+m+"位不能为"+Mas[j]+"!)");
                continue outer; 
            }
            //String字符类型数据转换为Integer整型数据
            int num2 = Integer.parseInt(String.valueOf(Mas[j]));
            sum += num2*w[j]; 
          }
          sum = sum%11;
          System.out.print("该身份证号码校验位为：");
          System.out.println(v[sum]);  
          return;
        
        }
    }
}
  