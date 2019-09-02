package com.DeHeadDoubleCList.dao;

import com.DeHeadDoubleCList.impl.IDoubleList;
import org.omg.CORBA.DATA_CONVERSION;

public class DeHeadDoubleClinkLise implements IDoubleList {
    class Node{
        private int data;
        private Node prev;//前驱节点
        private Node next;//后继节点


        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    private Node head;
    private Node last;//标志尾巴

    public DeHeadDoubleClinkLise() {
        this.head = null;
    }

    @Override
    public void addFirst(int data) {
        //第一次插入
        Node node = new Node(data);
        if(head == null){
            this.head = node;
            this.last = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head=node;
        }

    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head==null){
            this.head = node;
            this.last = node;

        }else{
            this.last.next = node;
            node.prev =  this.last;
            this.last = node;
        }

    }


    //检查Index的位置是否合法
    private void checkIndex(int index){
        if(index<0 ||index>getLength()){
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }

    private Node searchIndex(int index){
        checkIndex(index);
        Node cur = this.head;
        int count = 0;
        while(count<index){
            cur = cur.next;
            count++;
        }
        return cur;
    }

    @Override
    public boolean addindex(int index, int data) {
        if(index == 0){
            addFirst(data);
            return true;
        }else if(index == getLength()){
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node cur = searchIndex(index);
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
        return true;


    }

    @Override
    public boolean contains(int key) {
        return false;
    }

    @Override
    public int remove(int key) {
        return 0;
    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public void clear() {

    }
}
