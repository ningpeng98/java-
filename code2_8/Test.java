class Person{
    public String info = "Person";
}

class Student extends Person{
    //按照就近取用原则，找被覆盖的属性
    public String info = "Student";
}

public class Test{
    public static void main(String[] args){
        System.out.println("new Student().info");
    }
}