//使用Object接受所有类的对象
class Person{}
class Student{}
public class Test{
    public static void main(String[] args){
        fun(new Person());
        fun(new Student());
    }
    public static void  fun(Object obj){
        System.out.println(obj);
    }
}