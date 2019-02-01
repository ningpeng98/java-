//匿名内部类

interface MyInterface{
    void test();
}
class Outter{
    private int num;
    public void display(int para){
        //匿名内部类，实现MyInterface接口
        new MyInterface(){
            @Override
            public void test(){
                System.out.println("匿名内部类"+para);
            }

        }.test();
    }
}
public class Test{
    public static void main(String[] args){
        Outter outter = new Outter();
        outter.display(20);
    }
}
