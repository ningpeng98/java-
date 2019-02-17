

abstract class A{
    public void  print(){
        //空实现，普通方法
    }
}
public class Test{
    public static void main(String[] args){
        A a = new A();//错误;A是抽象类，无法实例化
    }
}