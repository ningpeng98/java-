//递归实现1-100叠加


public class Test{
    public static void main(String[] args){
        System.out.println(sum(100));
    }
    public static int sum(int num){
        if(num==1){
            return 1;
        }else{
            return num+sum(num-1);
        }
    }
}