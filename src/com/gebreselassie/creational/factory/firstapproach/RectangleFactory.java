package com.gebreselassie.creational.factory.firstapproach;

public class RectangleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
