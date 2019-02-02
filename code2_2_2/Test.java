//继承的基本实现（class子类extend父类）
class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Student extends Person{//定义了一个子类

}
public class Test{
    public static void main(String[]  args){
        Student student =  new Student();
        student.setName("Steven");
        student.setAge(18);
        System.out.println("姓名："+student.getName()+"，年龄："+student.getAge());
    }
}