import java.lang.reflect.Array;
import java.util.Scanner;


public class Test {

	public void getId()  {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入身份证前17位:");
		String id = in.nextLine();
		try {
			if (id.matches(".*[^0-9].*")||id.length()!=17) {
				throw new Exception();
			}
			System.out.println("校验位是"+getCheckCode(id));	
		} catch (Exception e) {
			System.out.println("输入了非数字或输入的身份证位数不等于17");
		}
	}

	public char getCheckCode(String str) {
		int[] w = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		char[] v = { '1', '0', 'x', '9', '8', '7', '6', '5', '4', '3', '2' };
		int[] id = new int[17];
		int s = 0;
		for (int i = 0; i < str.length(); i++) {
			id[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		System.out.println("------------------------");

		for (int i = 0; i < w.length; i++) {
			s += w[i] * id[i];
		}
		int y = s % 11;
		return v[y];

	}

	public static void main(String[] args) {
		
			new Test().getId();
		
	}
}