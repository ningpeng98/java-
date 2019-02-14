
//一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)都是前两个数字的和。
//创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
//例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。 
public class Test{
    public static void main(String[] args){
        for(int i = 1;i<=5;i++){
            System.out.print(Fib(i)+" ");
        }
    }
    public static int Fib(int num){
        if(num==1||num==2){
            return 1;
        }
        else{
            return Fib(num-1)+Fib(num-2);
        }

    }


}

