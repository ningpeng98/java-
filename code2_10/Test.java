//使用super调用父类属性

class Person{
    public String info = "爸爸";
}

class Student extends Person{
    public String info = "儿子";

    public void print(){
        //不找本类属性
        System.out.println(super.info);
        System.out.println(this.info);
    }
}

public class Test{
    public static void main(String[] args){
        new Student().print();
    }

}
