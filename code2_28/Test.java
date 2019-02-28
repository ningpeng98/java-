//观察toString()方法
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "姓名："+this.name+",年龄："+this.age;
    }
}
public class Test{
    public static void main(String[] args){
        String msg = "Hello"+new Person("Li si",18);
        System.out.println(msg);
    }
    public static void fun(Object obj){
        System.out.println(obj.toString());
        //默认输出对象调用的就是toString()方法
    }
}