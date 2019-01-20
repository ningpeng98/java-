class Person{
    {
        System.out.println("1.Person类的构造快");
        //构造快：定义在类中，不加任何修饰符
    }
    public Person(){
        System.out.println("2.Person类的构造方法");
    }
}
public class Test{
    public static void main(String[] args){
        new Person();
        new Person();
    }
}