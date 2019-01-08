public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				double rand = Math.random();
				double randTri = Math.random() * 3;
				if (randTri >= 0 && randTri < 1) {
					System.out.print((char) (rand * ('9' - '0') + '0'));
				} else if (randTri >= 1 && randTri < 2) {
					System.out.print((char) (rand * ('Z' - 'A') + 'A'));
				} else {
					System.out.print((char) (rand * ('z' - 'a') + 'a'));
				}
			}
			System.out.println();
		}
	}
}
