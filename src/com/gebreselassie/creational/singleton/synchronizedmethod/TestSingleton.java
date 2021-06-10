package com.gebreselassie.creational.singleton.synchronizedmethod;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(55);
        System.out.println("First reference " + singleton);
        System.out.println("data " + singleton.getData());

        singleton = null;
        singleton = Singleton.getInstance();
        System.out.println("Second reference " + singleton);
        System.out.println("data " + singleton.getData());
    }
}
