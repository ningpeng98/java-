package com.iterator_test;

import java.util.*;

public class ListItorator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("opq");
        list.add("lmn");
        list.add("xyz");
        //取得迭代器
        Iterator<String> iterator = list.iterator();
        //迭代输出
        while(iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("opq")){
                list.remove(str);
            }
            System.out.println(str);
        }


        /*
        Vector<String> list = new Vector<>();
        list.add("abc");
        list.add("opq");
        list.add("lmn");
        list.add("xyz");
        //取得枚举迭代器
        Enumeration<String> enumeration = list.elements();
        //迭代输出
        while(enumeration.hasMoreElements()){
            String str = enumeration.nextElement();
            System.out.println(str);
        }*/
        /*
        //取得迭代器
        Iterator<String> iterator = list.iterator();
        //迭代输出
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }*/
        /*
        for (String str: list) {
            System.out.println(str);

        }*/
        /*
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        while (iterator.hasPrevious()){
            String str = iterator.previous();
            System.out.println(str);
        }*/
    }
}
