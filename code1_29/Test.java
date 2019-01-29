class Outter{
    public void display(){
        //外部类访问内部类元素，需要通过内部类引用来访问
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        public void display(){
            System.out.println("I am a student");
        }
    }
}
public class  Test{
    public static void main(String[] args){
        Outter out = new Outter();
        out.display();
    }
}