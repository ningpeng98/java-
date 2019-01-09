/*
interface Organisms
	{
		public abstract void breathe();
		
	}
	 interface Animal extends Organisms
	{
		public abstract void eat();
		public abstract void sleep();
	}
	 interface Human extends Animal
	{
		public abstract void think();
		public abstract void learn();
	}
	 class Man implements Human
	{
		public void learn()
		{
			System.out.println(" person learn");
		}
		public void think()
		{
			System.out.println(" person think");
		}
		public void eat()
		{
			System.out.println(" person eat");
		}
		public void sleep()
		{
			System.out.println(" person sleep");
		}
		public void breathe()
		{
			System.out.println(" person breathe");
		}
	}
	public class Test555{
	public static void main(String[] args) {
		
    Man person = new Man();
    person.eat();
    person.breathe();
    person.learn();
    person.think();
    person.sleep();
	}
	}
*/

/*
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

public class Test555 {
	public static void main(String[] args) {
		String[] arr = new String[100];
			try {
				File file=new File("D:\\生成100个密码.txt");
				Writer out = new FileWriter(file);
			for (int i = 0; i < arr.length; i++) {
				StringBuilder sb1= new  StringBuilder();
				for(int j=0;j<3;j++) {
					int num=(int)(Math.random()*10);
					char word=(char)(Math.random()*26+'A');
					sb1.append(num);
					sb1.append(word);
					}
				arr[i]=sb1.substring(0);
				}
			for (int i = 0; i < arr.length; i++) {
				out.write("第"+(i+1)+"个密碼是"+arr[i]+"\r\n");
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
                          
		}
	}
}
*/
import java.util.Scanner;
public class Test555{

	static int[] w = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
	static char[] y = {'1','0','x','9','8','7','6','5','4','3','2'};
 	public static void main(String[] args)  {
		int num = 10;
		  while(num != 0){
			Scanner sc = new Scanner(System.in);
		System.out.print("请输入你的身份证信息:");
		String message = sc.nextLine();
		if(message.length() != 17)
		 throw  new RuntimeException("不是一个正确的身份证信息！请重试");
		
          num--;
		 	  
			int sum = 0;
		char [] tmp = message.toCharArray();
		  for(int j = 0; j < 17; j++)
		  {
			  if( '9'<tmp[j] || tmp[j] < '0')
				  throw new RuntimeException("不全是数字");
			  int number = Integer.parseInt(String.valueOf(tmp[j]));
			  sum += number*w[j];
		  }
		   sum = sum%11;
		   System.out.println("校验位为：");
		   System.out.println(y[sum]);
		  }
		 
	} 
}