package com.gebreselassie.creational.factory.firstapproach;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}
