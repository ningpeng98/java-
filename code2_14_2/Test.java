//创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";
//再为这个类添加一个重载构造方法，令其接收一个字符串参数，
//并在这个有参构造方法中把"Hello Constructor"和接收的参数一起打印出来。 

class Test1{
    private String name;
    public Test1(){
        System.out.println("Hello Constructor");
    }
    public Test1(String name){
        this();
        this.name = name;
    }
    public String Print(){
        return name;
    }
}
public class Test{
    public static void main(String[] args){
        Test1 test1 = new Test1();
        Test1 test2 = new Test1("asdf");
        System.out.println(test1.Print());
    }
}