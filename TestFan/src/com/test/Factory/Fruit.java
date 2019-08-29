package com.test.Factory;

public interface Fruit {
    void eat();
}

class Apple implements Fruit{

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit{

    @Override
    public void eat() {
        System.out.println("吃橘子");
    }
}

class FruitFactory{
    private FruitFactory(){

    }
    public static Fruit getFruit(String className){
        try {
            Class class1 = Class.forName(className);
            return (Fruit) class1.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
