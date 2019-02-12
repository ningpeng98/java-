class Person{
    public void print(){
        System.out.println("我是人类");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("我是学生");
    }
}

class Worker extends Person{
    public void print(){
        System.out.println("我是工人");
    }
}

public class Test{
    public static void main(String[] args){
        whoYouAre(new Student());
        whoYouAre(new Worker());
    }
    public static void whoYouAre(Person per){
        per.print();
    }
}