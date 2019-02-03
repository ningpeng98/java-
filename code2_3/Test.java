
//子类进行功能扩充

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
    private String school;//扩充的新属性

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school = school;
    }
}
public class Test{
    public static void main(String[] args){
        Student student = new Student();
        student.setName("Steven");
        student.setAge(18);
        student.setSchool("西科大");

        System.out.println("姓名："+student.getName()+"，年龄："+student.getAge()+",学校："+student.getSchool());
    }
}