abstract class A{
    public A(){
        this.print();
    }
    public abstract void print();
}
class B extends A{
    private int num = 100;
    public  B (int main){
        super();
        this.num = num;
    }
    public void print(){
        System.out.println(this.num);
    }
} 

public class Test{
    public static void main(String[] args){
        new B(30);
    }
    }
