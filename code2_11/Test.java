//观察向上转型
class Person{
    public void print(){
        System.out.println("我是爸爸");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("我是儿子");
    }
}
public class Test{
    public static void main(String[] args){
        Person per = new Student();//向上转型
        per.print();
    }
}