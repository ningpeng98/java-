class Person{
    private String name;
    private int age;
    
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int i){
        if(i>0&&i<=200){
            age=i;
        }else{
            age=0;
        }
    }
    public int getAge(){
        return age;
    }
    public void getPersonInfo(){
        System.out.println("姓名："+name+",年龄："+age);
    }
}
public class Test{
    public static void main(String[] args){
        Person person = new Person();
        person.setName("张三");
        person.setAge(-200);
        person.getPersonInfo();
    }
}