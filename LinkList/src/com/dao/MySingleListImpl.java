package com.dao;
//不带头单链表
import com.impl.ILinked;

public class MySingleListImpl implements ILinked {
    class Node{
        public int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public MySingleListImpl(){
        this.head = null;
    }



    //头插法
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head==null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }



    }
    //尾插法
    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(cur == null){
            this.head = node;
        }else{
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }






    //找到Index-1位置的节点
    private Node searchIndex(int index){
        checkIndex(index);
        if(index == 0){
            return null;
        }
        int count = 0;
        Node cur =  this.head;
        while(cur.next!=null && count<index-1){
            cur = cur.next;
            count++;
        }
        return cur;
    }
    private void checkIndex(int index){
        if(index<0 ||index>getLength()){
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    @Override
    public boolean addindex(int index, int data) {
        Node node = new Node(data);
        //找到Index-1位置的节点
        Node cur = searchIndex(index);
        if(cur == null){
            node.next = this.head;
            this.head = node;
        }else{
            node.next = cur.next;
            cur.next = node;
        }
        return true;
    }


    //查找是否包含关键字key是否在单链表当中
    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    private Node SearchPre(int key){
        //1.判断是否是第一个节点
        Node cur = this.head;
        if(cur.data == key){
            return this.head;
        }else{
            while(cur.next!=null){
                if(cur.next.data != key){
                    cur = cur.next;
                }else{
                    return cur;
                }
            }
        }
        return null;


    }


    //删除第一次出现关键字为key的节点
    @Override
    public int remove(int key) {
        Node pre = SearchPre(key);
        int oldData = 0;
        if(pre == null){
            return -1;
        }
        if(pre == this.head && pre.data == key){
            oldData = this.head.data;
            this.head = this.head.next;
            return oldData;

        }
        Node delNode = pre.next;
        pre.next = delNode.next;

        return oldData;
    }
    //删除所有值为key的节点
    @Override
    public void removeAllKey(int key) {
        Node pre = this.head;
        Node cur = this.head.next;
        while(cur!=null){
            if(cur.data == key){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        if(this.head.data==key){
            head = head.next;
        }


    }
    //得到单链表的长度
    @Override
    public int getLength() {
        Node cur = this.head;
        int length = 0;
        while (cur!=null){
            cur = cur.next;
            length++;
        }
        return length;
    }
    //打印链表所有数据
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
        while(head!=null){
            Node cur = this.head.next;
            this.head.next = null;
            this.head = cur;
        }

    }
}
