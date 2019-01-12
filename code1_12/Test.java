import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {
	

	public void passWord() {
		try {
			File file = new File("D:\\100个.txt");
			Writer out = new FileWriter(file);

			for (int n = 0; n < 100; n++) {
				StringBuilder password = new StringBuilder();
				for (int i = 0; i < 3; i++) {
					int num = (int) (Math.random() * 10);
					char word = (char) ('A' + Math.random() * 26);
					password.append(num);
					password.append(word);
				}
				out.write("第"+(n+1)+"个随机密码是:"+password.substring(0) +"\r\n");
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("读取错误");
		}

	}

	public static void main(String[] args) {

		new Test().passWord();

	}
}