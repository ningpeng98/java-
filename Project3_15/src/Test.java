import javax.xml.crypto.Data;
import java.util.Date;
//可变参数格式：public [static] [final] 返回值 方法名称（[参数类型 参数名称] [参数类型 ... 参数名称]）
public class Test {
    public static void main(String[] args) {
        System.out.println(add("Hello"));
        System.out.println(add("yu",new int[]{1}));
        System.out.println(add("world",new int[]{1,2,3}));
        System.out.println(add("中国",new int[]{1,2,3,4,5,6,7,8}));
    }

    //早期，数组元素相加
//    public static int add(int[] data){
//        int result = 0;
//        for(int i = 0;i < data.length;i++){
//            result += data[i];
//        }
//        return result;
//    }


//    可变参数方法
//    public static int add(int ... data){
//    int result = 0;
//    for(int i = 0;i < data.length;i++){
//        result += data[i];
//    }
//    return result;
//    }


//传递多类参数
    public static int add(String msg,int ... data){
        int result = 0;
        for(int i = 0;i < data.length;i++){
            result += data[i];
        }
        return result;
    }

}
