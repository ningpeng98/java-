package com.collection.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //添加元素
        for(int i = 0;i<9;i++){
            list.add(i);
        }
        //查看元素
        System.out.println(list.toString());
        //查看list大小
        System.out.println(list.size());

        //查询6是否存在
        System.out.println(list.contains(6));
        //得到index为3的元素
        System.out.println(list.get(3));
        //修改index为5的元素为16
        System.out.println(list.set(5,16));
        System.out.println(list.toString());

        //删除index为8的元素
        System.out.println(list.remove(4));
        System.out.println(list.toString());

    }
}
