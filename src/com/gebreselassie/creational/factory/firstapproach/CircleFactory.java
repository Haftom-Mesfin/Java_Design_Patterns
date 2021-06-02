package com.gebreselassie.creational.factory.firstapproach;

public class CircleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
