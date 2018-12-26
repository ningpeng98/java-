abstract class Person{
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract void getPersonInfo();
}
class Student extends Person{
    public void getPersonInfo(){
        System.out.println("I am a student!");
    }
}

public class Test{
    public static void main(String[] args){
        Person per = new Student();
        per.getPersonInfo();
    }
}