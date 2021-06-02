package com.gebreselassie.creational.factory.firstapproach;

public class SquareFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
