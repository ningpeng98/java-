package Day41;
import java.util.Scanner;
public class Main41_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'W' || str.charAt(i) == 'A' || str.charAt(i) == 'S' || str.charAt(i) == 'D') && (str.charAt(i + 1) >= 48 && str.charAt(i + 1) <= 57) && (str.charAt(i + 2) >= 48 && str.charAt(i + 2) <= 57)) {
                if (str.charAt(i) == 'W') {
                    y -= (str.charAt(i + 1) - 48) * 10 + (str.charAt(i + 2) - 48);
                }
                if (str.charAt(i) == 'S') {
                    y += (str.charAt(i + 1) - 48) * 10 + (str.charAt(i + 2) - 48);
                }
                if (str.charAt(i) == 'A') {
                    x -= (str.charAt(i + 1) - 48) * 10 + (str.charAt(i + 2) - 48);
                }
                if (str.charAt(i) == 'D') {
                    x += (str.charAt(i + 1) - 48) * 10 + (str.charAt(i + 2) - 48);
                } else if ((str.charAt(i) == 'W' || str.charAt(i) == 'A' || str.charAt(i) == 'S' || str.charAt(i) == 'D') && (str.charAt(i + 1) >= 48 && str.charAt(i + 1) <= 57) && (str.charAt(i + 2) < 48 || str.charAt(i + 2) > 57)) {
                    if (str.charAt(i) == 'W') {
                        y -= (str.charAt(i + 1) - 48);

                    }
                    if (str.charAt(i) == 'S') {
                        y += (str.charAt(i + 1) - 48);

                    }
                    if (str.charAt(i) == 'A') {
                        x -= (str.charAt(i + 1) - 48);

                    }
                    if (str.charAt(i) == 'D') {
                        x += (str.charAt(i + 1) - 48);

                    }
                }
            }
        }
        System.out.println(x + "," + y);
        System.out.println(str);
    }
}
