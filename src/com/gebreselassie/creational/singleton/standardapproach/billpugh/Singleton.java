package com.gebreselassie.creational.singleton.standardapproach.billpugh;

public class Singleton {
    // Nested inner class is referenced after getInstance() is called.
    private static class SingletonHelper{
        private static final Singleton uniqueInstance = new Singleton();
    }
    private int data;

    private Singleton(){

    }

    public static Singleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
