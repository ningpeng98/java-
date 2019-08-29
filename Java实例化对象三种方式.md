在Java中实例化一个类的对象，通常有以下三种方式：
#### 1.  Object类中的`getClass()`方法取得Class类对象。

```java
public static void main(String[] args) {
    Date date = new Date();
    Class class1 = date.getClass();
    System.out.println(class1);
}
```

#### 2.  `类名.class`:直接根据某个具体的类来取得Class类的实例化对象。

```java
public static void main(String[] args) {
    Date date = new Date();
	Class class2 = Date.class;
	System.out.println(class2);
}
```

#### 3.  使用Class类的静态方法`forName(类的全限定名)`获取
类的全限定名=包名+类名

```java
public static void main(String[] args) {
    Date date = new Date();
	try {    
  	 	 Class class3 = Class.forName("java.util.Date");                     			 				System.out.println(class3);
} catch (
   		 ClassNotFoundException e) {   
    	e.printStackTrace();
}	
}
```

结果都为：

```
class java.util.Date
class java.util.Date
class java.util.Date
```



结果分析：
在如上结果中：class【对象】 java.util.Date【类】
Class类对类进行抽象
Class Object描述具体一个类

#### 区别：

1.前两种获取class对象时都会进行编译时检查，运行时才会加载指定类尝试获取，有可能获取不到，此时会抛出受查异常；

2.第二种方式下，若是首次使用该类将会加载该类的class文件，并执行静态代码块；