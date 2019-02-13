//编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。 
class Person{
    private String name;
    private int age;
    private static String country;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void setCountry(String c){
        country = c;
    } 

    public void getPersonInfo(){
        System.out.println("姓名:"+this.name+",年龄："+this.age+",国家："+this.country);
    }
}
public class Test{
    public static void main(String[] args){
        Person.setCountry("中国");
        Person person = new Person("张三",20);
        person.getPersonInfo();


    }
}
