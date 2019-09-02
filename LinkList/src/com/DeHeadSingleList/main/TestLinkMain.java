package com.DeHeadSingleList.main;
/**
 * 不带头单链表
 */
import com.DeHeadSingleList.dao.MySingleListImpl;

public class TestLinkMain {
    public static void main(String[] args) {
        MySingleListImpl mySingleList = new MySingleListImpl();
        mySingleList.addFirst(5);
        mySingleList.addFirst(8);
        mySingleList.addFirst(16);
        mySingleList.display();
        mySingleList.addindex(1,12);
        mySingleList.display();
        mySingleList.addLast(30);
        mySingleList.display();
        System.out.println(mySingleList.contains(12));
        System.out.println(mySingleList.contains(50));
        mySingleList.remove(
                12);
        mySingleList.display();
        mySingleList.remove(30);
        mySingleList.display();
        mySingleList.addFirst(7);
        mySingleList.addLast(7);
        mySingleList.addindex(3,7);
        mySingleList.addindex(6,7);
        mySingleList.addindex(2,7);
        mySingleList.display();
        mySingleList.remove(7);
        mySingleList.display();
        mySingleList.removeAllKey(7);
        mySingleList.display();
        System.out.println("clear之后：");
        mySingleList.display();
        System.out.println("******************");

    }
}
