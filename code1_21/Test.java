class Person{
    {
        System.out.println("1.Person类的构造快");
    }

    public Person(){
        System.out.println("2.Person类的构造方法");
    }

    static{
        System.out.println("3.Person类的静态块");
    }
}

public class Test{
    public static void main(String[] args){
        System.out.println("--start--");
        new Person();
        new Person();
        System.out.println("--end--");
    }
}