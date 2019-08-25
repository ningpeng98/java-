package com.main;

import com.dao.SequenceImpl;

public class TestMain {
    public static void main(String[] args) {
        SequenceImpl sequence = new SequenceImpl();
        //插入
        for (int i = 10; i >=0; i--) {
            sequence.add(10-i,i);
        }
        //打印
        sequence.display();
        //输出顺序表大小
        System.out.println(sequence.size());
        //判断元素"5"是否在顺序表中
        System.out.println(sequence.contains(5));
        //得到3位置的值
        System.out.println(sequence.getPos(3));
        //返回数字9（存在）和数字15（不存在）对应的下标
        System.out.println(sequence.search(9));
        System.out.println(sequence.search(15));
        //删除首个出现的"6",并打印一次观察
        sequence.remove(6);
        sequence.display();
        //将顺序表清空，并打印一次
        System.out.println("将顺序表清空，并打印一次:");
        sequence.clear();
        sequence.display();


    }
}
