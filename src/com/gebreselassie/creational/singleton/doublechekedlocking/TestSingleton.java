package com.gebreselassie.creational.singleton.doublechekedlocking;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(101);
        System.out.println("First reference " + singleton);
        System.out.println("Data " + singleton.getData());

        singleton = null;
        singleton = Singleton.getInstance();
        System.out.println("Second reference " + singleton);
        System.out.println("Data " + singleton.getData());
    }
}
