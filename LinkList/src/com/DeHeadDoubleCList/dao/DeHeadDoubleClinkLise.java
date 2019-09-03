package com.DeHeadDoubleCList.dao;
/**
 * 不带头双向链表实现
 * */
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
        Node cur = this.head;
        while(cur!=null){
            if(cur.data == key){
                return true;

            }else{
                cur = cur.next;
            }
        }
        return false;

    }

    @Override
    public int remove(int key) {
        Node cur = this.head;
        while (cur!=null){
            if(cur.data == key){
                int oldDate = cur.data;
                //删除的节点是头节点
                if(cur == this.head){
                    this.head= this.head.next;
                    this.head.prev = null;

                }else{
                    cur.prev.next = cur.next;;
                    if(cur.next!=null){
                        cur.next.prev = cur.prev;
                    }else{
                        //删除最后一个节点，last需要指回来
                        this.last = cur.prev;
                    }
                }
                return oldDate;
            }
            cur = cur.next;
        }

        return -1;
    }

    @Override
    public void removeAllKey(int key) {
        Node cur = this.head;
        while (cur!=null){
            if(cur.data == key){
                //删除的节点是头节点
                if(cur == this.head){
                    this.head= this.head.next;
                    this.head.prev = null;

                }else{
                    cur.prev.next = cur.next;;
                    if(cur.next!=null){
                        cur.next.prev = cur.prev;
                    }else{
                        //删除最后一个节点，last需要指回来
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    @Override
    public int getLength() {
        int count = 0;
        Node cur = this.head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();

    }

    @Override
    public void clear() {
        while(this.head!=null){
            Node cur = this.head.next;
            head.prev = null;
            head.next = null;
            head = cur;
        }

        this.last = null;


    }
}
