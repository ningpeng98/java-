class Person{
    public void print(){
        System.out.println("我是爸爸");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("我是儿子！");
    }
    public void fun(){
        System.out.println("只有儿子有！");
    }
}

public class Test{
    public static void main(String[] args){
        Person per = new Student();
        per.print();
        //这个时候父类能够调用的方法只能是本类定义好的方法
        //所以并没有Student类中的fun()方法，那么只能进行向下转型处理
        Student  stu = (Student) per;
        stu.fun();
    }
}