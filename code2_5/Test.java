、//子类对象的创建
class Person{
    public Person(){
        System.out.println("Person类对象产生");

    }
}

class Student extends Person{
    public Student(){
        super();
        System.out.println("Student类对象产生");
    }
}
public class Test{
    public static void main(String[] args){
        new Student();
    }
} 