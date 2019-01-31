//使用方法内部类
class Outter{
    private int num;
    public void display(int test){
        class Inner{
            private void fun(){
                num++;
                System.out.println(num);
                System.out.println(test);
            }
        }
        new Inner().fun();
    }
}
public class Test{
    public static void main(String[] args){
        Outter out = new Outter();
        out.display(20);
    }
}