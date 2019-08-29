package com.test.reflect;


import java.util.Date;

public class Test {
 //   public static void main(String[] args) {




/*        Class class1 = Date.class;
        try {
            Object object = class1.newInstance();
            Date date = (Date) object;

            Class class2 = Integer.class;
            Integer integer = (Integer) class1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/
 //   }
public static void main(String[] args) {
    Date date = new Date();
    Class class1 = date.getClass();
    System.out.println(class1);
    Class class2 = Date.class;
    System.out.println(class2);
    try {
        Class class3 = Class.forName("java.util.Date");
        System.out.println(class3);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    //结果：class【对象】 java.util.Date【类】
    //Class类对类抽象，Class Object描述具体一个类
}
}
