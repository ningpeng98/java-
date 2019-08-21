import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        char[] arr = new char[26];
        char i = 'a';
        for (int j = 0; j < 26; j++,i++) {
            arr[j] = i;
        }

        System.out.println(Arrays.toString(arr));
        sda2();

    }
    public static void sda2(){
        print();
        System.out.println("123");
    }
    public static void print(){
        System.out.println("helo!");
    }
}
