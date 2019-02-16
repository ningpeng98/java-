//使用static定义的内部接口
interface A{
    public void printA();
    static interface B{
        public void printB();//使用static定义，描述一个外部接口
    }
}
class Impl implements A.B{
    public void printB(){
        
    }

}
public class Test{
    public static void main(String[] args){

    }
}