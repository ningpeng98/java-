package com.test.Factory;

public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruit("com.test.Factory.Orange");
        if(fruit!=null){
            fruit.eat();
        }else{
            System.out.println("FruitFactory创建失败");
        }
    }
}
