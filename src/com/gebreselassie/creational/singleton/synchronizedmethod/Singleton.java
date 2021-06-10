package com.gebreselassie.creational.singleton.synchronizedmethod;

public class Singleton {
    private static Singleton uniqueInstance = null;
    private int data;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            return new Singleton();
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
