abstract class Person{
    private String name;
    public Person(){
        System.out.println("**********");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract void getPersoninfo();
}
class Student extends Person{
    public Student(){
        System.out.println("#########");
    }
    public void  getPersonInfo(){

    }
}
public class Test{
    public static void main(String[] args){
        new Student();
    }
}