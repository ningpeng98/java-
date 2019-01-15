class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.print();//调用普通方法
    }
    public String getPersonInfo(){
        return "姓名："+name+",年龄："+age;
    }
    public void print(){
        System.out.println("*******************");
    }
}
public class Test{
    public static void main(String[] args){
        Person per = new Person("张三",20);
        System.out.println(per.getPersonInfo());


    }
}