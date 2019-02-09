//使用super调用父类的同名方法

class Person{
    public void  print(){
        System.out.println("I am father");
    }
}

class Student extends Person{
    public void print(){
        super.print();
        System.out.println("I am child");
    }
}

public  class Test{
    public static void main(String[] args){
        new Student().print();
    }
}