package com.HasHeadCList.dao;
/**
 * 带头结点循环单链表
 * */
import com.HasHeadCList.impl.CLinkList;

public class CHeadSingleListImpl implements CLinkList {

    class Node{
        private Node next;
        private int data;

        public Node(){
            this.data = -1;
        }


        public Node(int data){
            this.data = data;
        }
    }


    private Node head;
    public CHeadSingleListImpl(){
        this.head = new Node();
        this.head.next = this.head;
    }
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = this.head.next;
        this.head.next = node;





    }

    @Override
    public void addLast(int data) {

        Node cur = this.head;
        while(cur.next!=this.head){
            cur = cur.next;
        }
        Node node = new Node(data);

        node.next = this.head;
        cur.next = node ;


    }

    @Override
    public boolean addIndex(int index, int data) {
        checkIndex(index);
        Node cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;

        return true;
    }

    //检查Index的位置是否合法
    private void checkIndex(int index){
        if(index<0 ||index>getLength()){
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }


    @Override
    public boolean contains(int key) {
        Node cur = this.head.next;
        while(cur!=this.head){
            if(cur.data == key){
                return true;
            }else{
                cur = cur.next;
            }
        }
        return false;
    }




    //找前驱
    private Node searchPre(int key){
        Node pre = this.head;
        while(pre.next!=this.head){
            if(pre.next.data == key){
                return pre;
            }else{
                pre = pre.next;
            }
        }
        return null;

    }

    @Override
    public int remove(int key) {
        Node pre = searchPre(key);
        if(pre == null){
            throw new UnsupportedOperationException("key不存在");
        }
        int oldData = 0;
        Node delNode = pre.next;
        pre.next = delNode.next;
        oldData = delNode.data;
        return oldData;
    }



    @Override
    public void removeAllKey(int key) {
        Node pre = this.head;
        Node cur = this.head.next;
        while(cur!=this.head){
            if(cur.data == key){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;;
            }
        }
    }

    @Override
    public int getLength() {
        Node cur = this.head.next;
        int count = 0;
        while(cur!=this.head){
            count++;
            cur = cur.next;
        }
        return count;
    }

    @Override
    public void display() {
        Node cur = this.head.next;
        while(cur!=this.head){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public  void clear() {
        while(this.head.next != this.head){
            Node cur = this.head.next;
            this.head.next = cur.next;
            cur.next = null;

        }
        this.head=null;
    }
}

