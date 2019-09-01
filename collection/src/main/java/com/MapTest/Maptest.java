package com.MapTest;

import java.util.*;

public class Maptest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"test1");
        map.put(2,"test2");
        map.put(3,"test3");
        map.put(4,"test4");
        map.put(3,"test改");
        map.put(5,null);

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        /*
        System.out.println(map.get(3));
        Set<Integer> keyset =  map.keySet();
        Iterator<Integer> iterator = keyset.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i+"="+map.get(i));
        }*/
    }
}
