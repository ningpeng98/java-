package Day13;
//牛客#大数相加
import java.math.BigInteger;
import java.util.*;
public class Main12_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String addeng = sc.nextLine();
        String augend = sc.nextLine();
        System.out.println(AddLongInteger(addeng,augend));

    }
    public static String AddLongInteger(String addeng,String augend){
        String str =null;
        BigInteger A = new BigInteger(addeng);
        BigInteger B = new BigInteger(augend);
        BigInteger sum = A.add(B);
        str = sum.toString();
        return str;
    }
}
