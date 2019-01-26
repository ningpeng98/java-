class Outer{
    private String msg = "Hello world";
    public String getMsg(){//通过此方法取得msg属性
        return this.msg;

    }
    public void fun(){//3.由out对象调用了fun()方法
        Inner in = new Inner(this);//4.this表示当前对象
        in.print();//7.调用方法

    }
}
class Inner{
    private Outer out;
    public Inner(Outer out){//5.Inner.out = main.out
        this.out = out;//6.引用传递
    }
    public void print(){//8.执行此方法
        System.out.println(out.getMsg());
    }
}

public class Test{
    public static void main(String[] args){
        Outer out = new Outer(); //1.实例化Outer类对象
        out.fun();//2.调用Outter类方法
    }
}