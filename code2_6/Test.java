class Person{
    public void print(){
        System.out.println("1.[Person类的print方法]");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("2.[Student]类的print方法");
    }
}
public class Test{
    public static void main(String[] args){
        new Student().print();
    }
}