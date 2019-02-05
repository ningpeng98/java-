//显式继承与隐式继承
class Person{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Student extends Person{
    public void fun(){
        System.out.println(getName());
    }
}

public class Test{
    public static void main(String[] args){
        Student student = new Student();
        student.setName("Stven");
        System.out.println(student.getName());
        student.fun();
    }
}