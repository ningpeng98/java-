package com.DeHeadDoubleCList.dao;

import com.DeHeadDoubleCList.impl.IDoubleList;

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
            
        }

    }

    @Override
    public boolean addindex(int index, int data) {
        return false;
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
