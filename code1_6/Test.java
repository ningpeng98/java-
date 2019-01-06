class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void getInfo(){
        System.out.println("姓名："+this.name+",年龄："+this.age);
    }
}

public class Test{
    public static void main(String[] args){
        Person[] per = new Person[]{
            new Person("张三",1),
            new Person("李四",2),
            new Person("王五",3)
        };
        for(int x = 0;x<per.length;x++){
            per[x].getInfo();
        }
    }
}