public class Test{
    {
    System.out.println("1.Test的构造快");
    }
    public Test(){
        System.out.println("2.Test的构造方法");
    }

    static{
        System.out.println("3.Test的静态块");
    }

    public static void main(String[] args){
        System.out.println("--start--");
        new Test();
        new Test();
        System.out.println("--end--");




    }
}