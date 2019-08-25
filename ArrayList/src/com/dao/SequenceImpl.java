package com.dao;

import com.Impl.ISequence;

import java.util.Arrays;

public class SequenceImpl implements ISequence {
    private Object[] elemDate;
    private int usedSize;
    public static final int DEFAULT_CAPACITY = 10;

    public SequenceImpl(){
        this.elemDate = new Object[DEFAULT_CAPACITY];
        this.usedSize = 0;
    }
    //判断顺序表是否为空
    private boolean isFull(){
        return this.usedSize == this.elemDate.length;
    }
    private boolean isEmpty(){
        return this.usedSize == 0;
    }
    @Override
    ////在pos位置插入data
    public boolean add(int pos, Object data) {
        //判断pos位置的合法性
        if(pos>this.usedSize || pos<0){
            return false;
        }
        if(isFull()){
            //扩容
            this.elemDate = Arrays.copyOf(this.elemDate,this.elemDate.length*2);
        }
        else{
            //移动数据
            for(int i = this.usedSize-1;i>=pos;i--){
                //Object[i] = Object[i-1];
                this.elemDate[i+1] = this.elemDate[i];
            }
        }

        //放入数据，并且usedSize++
        this.elemDate[pos] = data;
        this.usedSize++;

        return true;
    }


    //查找关键字key 找到返回key的下标，没有返回null;
    @Override
    public int search(Object key) {
        if(key == null){
            throw new UnsupportedOperationException("不可以传入null作为参数！");
        }
        if(isEmpty()){
            return -1;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elemDate[i].equals(key)){
                return i;
            }

        }
        return -1;
    }
    //查找是否包含关键字key是否在顺序表当中(这个和search有点冲突)
    @Override
    public boolean contains(Object key) {
        if(key.equals(null)){
            throw new UnsupportedOperationException("不可以传入null作为参数！");
        }
        if(isEmpty()){
            return false;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elemDate[i] == key){
                return true;
            }
        }
        return false;
    }
    //得到pos位置的值
    @Override
    public Object getPos(int pos) {
        if(pos<0 || pos >= this.usedSize){
            return null;
        }
        return this.elemDate[pos];
    }
    //删除第一次出现的关键字key
    @Override
    public Object remove(Object key) {
        int index = search(key);
        if(index == -1){
            return -1;
        }
        Object oldData = this.elemDate[index];
        int i = index;
        for(;i<this.usedSize-1;i++){
            this.elemDate[i] = this.elemDate[i+1];
        }
        this.elemDate[i+1] = null;
        this.usedSize--;
        return oldData;
    }
/*    //删除第一次出现的关键字key
    @Override
    public Object remove(Object key) {
        if(key.equals(null)){
            throw new UnsupportedOperationException("不可以传入null作为参数！");
        }
        if(isEmpty()){
            return false;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elemDate[i] == key){
                for (int j = i; j < this.usedSize; j++) {
                    this.elemDate[i] = this.elemDate[i+1];
                }
            }
            break;
        }
        this.usedSize--;

        return null;
    }*/
    //得到顺序表的长度
    @Override
    public int size() {
        return this.usedSize;
    }
    //打印顺序表
    @Override
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elemDate[i]+" ");

        }
        System.out.println();

    }
    //清空顺序表以防内存泄漏
    @Override
    public void clear() {
        for (int i = 0; i < this.usedSize; i++) {
            this.elemDate[i] = null;
        }
        this.usedSize = 0;

    }
}
