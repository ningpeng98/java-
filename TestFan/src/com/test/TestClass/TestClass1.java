package com.test.TestClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class TestClass1 {
    public static void main(String[] args) {
        Class class2 = Message.class;
        //获取Massage的所有构造方法(构造方法名+（构造方法参数）)
        Constructor[] constructors = class2.getConstructors();
        for (Constructor con: constructors) {
            System.out.println(con.getName()+"("+Arrays.toString(con.getParameterTypes()) +")");
        }
        System.out.println("*********************************");
        //获取指定的构造方法
        try {
            Constructor constructor = class2.getConstructor(String.class,Integer.class);
            System.out.println(constructor.getName()+"("+Arrays.toString(constructor.getParameterTypes()) +")");


            //通过构造方法对象获取实例化对象
            Object obj = constructor.newInstance("Jack",22);
            System.out.println(obj);
            System.out.println(obj.getClass());
            Message massage = (Message) obj;
            System.out.println(massage.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}

interface IMassage{

}
interface OperatorSystem{

}

class ChatMessage {

}
class Message extends ChatMessage implements IMassage,OperatorSystem{
    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //构造方法1
    public Message(){

    }
    //构造方法2
    public Message(String name,Integer age){
        this.name = name;
        this.age = age;

    }
    //构造方法3
    public Message(Integer age,String name){
        this(name,age);

    }
}

/**
 * 反射取得父类信息
*/
class Test1{

    public static void main(String[] args) {
        Class class1 = Message.class;
        //获取包名
        Package package1 = class1.getPackage();
        System.out.println(package1.getName());
        System.out.println(package1.toString());
        System.out.println("*********************************");

        //获取类名
        System.out.println(class1.getName());  //包名+类名=类的全限定名
        System.out.println(class1.getSimpleName());  //仅类名
        System.out.println("*********************************");

        //获取父类名及父类包名,若无父类，返回Object类
        Class superClass = class1.getSuperclass();
        System.out.println(superClass.getName());
        System.out.println(superClass.getPackage().getName());
        System.out.println("*********************************");

        //获取实现的接口信息
        Class[] classes = class1.getInterfaces();
        for (Class cls : classes) {
            System.out.println(cls.getName());
        }
        System.out.println("*********************************");
    }
}





