class Person{
    String Country = "中國";
    String name;
    int age;
    public void getPersonInfo(){
        System.out.println("姓名:"+this.name+",年龄："+this.age+",国家："+this.Country);
    }
}
public class Test{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "張三";
        p1.age = 20;
        Person p2 = new Person();
        p1.name = "李四";
        p1.age = 25;
        p1.getPersonInfo();
        p2.getPersonInfo();

    }
}