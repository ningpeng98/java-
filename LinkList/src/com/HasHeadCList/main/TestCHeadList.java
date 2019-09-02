package com.HasHeadCList.main;
/**
 * 带头结点循环单链表
 * */
import com.HasHeadCList.dao.CHeadSingleListImpl;

public class TestCHeadList {
    public static void main(String[] args) {
        CHeadSingleListImpl cHeadSingleList = new CHeadSingleListImpl();
        cHeadSingleList.addFirst(5);
        cHeadSingleList.addFirst(8);
        cHeadSingleList.addFirst(16);
        cHeadSingleList.display();
        cHeadSingleList.addIndex(1,12);
        cHeadSingleList.display();
        cHeadSingleList.addLast(30);
        cHeadSingleList.display();
        System.out.println(cHeadSingleList.contains(12));
        System.out.println(cHeadSingleList.contains(50));
        cHeadSingleList.remove(
                12);
        cHeadSingleList.display();
        cHeadSingleList.remove(30);
        cHeadSingleList.display();
        cHeadSingleList.addFirst(7);
        cHeadSingleList.addLast(7);
        cHeadSingleList.addIndex(3,7);
        cHeadSingleList.addIndex(6,7);
        cHeadSingleList.addIndex(2,7);
        cHeadSingleList.display();
        cHeadSingleList.remove(7);
        cHeadSingleList.display();
        cHeadSingleList.removeAllKey(7);
        cHeadSingleList.display();
        cHeadSingleList.clear();
        System.out.println("clear之后：");
        cHeadSingleList.display();//cleear之后head也为null,正常情况下会报错
        System.out.println("******************");
    }
}
