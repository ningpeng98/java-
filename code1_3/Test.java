import java.util.Arrays;
public class Test{
    public static void main(String[] args){
        int[] original = new int[]{1,3,5,7,9};
        int[] result = Arrays.copyOf(original,3);
        for(int temp:result){
            System.out.println(temp);
        }
    }
}