//父类使用private定义的方法，子类中使用public覆写
class Person{
    public void fun(){
        this.print();
    }
//    若父类使用了private定义，表示该方法只能被父类使用，子类无法使用。换言之
//子类根本不知道父类有此方法
    private void print(){
        System.out.println("1.[Person]类的print方法");
    }
}
class Student extends Person{
//这个时候该方法只是子类定义的新方法而已，并没有和父类的方法有任何联系
    public void print(){
        System.out.println("2.[Student]类的print方法");
    }
}

public class Test{
    public static void main(String[] args){
        new Student().fun();
    }
}