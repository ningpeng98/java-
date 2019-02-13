//1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。 
class Test1{
    public int a;
    public char b;

}

public class Test{
    public static void main(String[] args){
        Test1 test1 = new Test1();
        System.out.println(test1.a);
        System.out.println(test1.b);
    }
}
