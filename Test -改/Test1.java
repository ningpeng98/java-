//100个66位密码
//1,3,5位为数字，2,4,6位为大写字母
//存储到文件中
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class Test1 {
	public void InitFile() {
		try {
            //创建文件
			File file = new File("C:/Users/宁鹏/Desktop/Password.txt");
            Writer out = new FileWriter(file);
            //循环100次，用来产生100个密码
            for(int i=1;i<=100;i++){
                //产生随机数或随机字符
                StringBuilder password = new StringBuilder();
                //循环6次，用来产生每个密码的6位
                for(int j=1;j<=6;j++){
                    //判断位置为1,3,5位还是2,4,6位
                    if(j%2==1){
                        //1,3,5位产生随机数字
                        password.append((int) (Math.random() * 10));

                    }else{
                        //2,4,6位产生随机大写字符
                        password.append((char) ('A' + Math.random() * 26));
                    }
                }
                //输出并换行
                    out.write("Password-"+i+":"+password.substring(0) +"\r\n");

            }
            //刷新关闭文件
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("ERROR!");
		}

	}
	public static void main(String[] args) {

		new Test1().InitFile();

	}
}
