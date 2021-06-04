package com.gebreselassie.creational.factory.staticfactory.client;

import com.gebreselassie.creational.factory.staticfactory.interfaceanditsimplementations.Shape;
import com.gebreselassie.creational.factory.staticfactory.factorymethod.ShapeFactory;

public class Client {
    public static void main(String[] args) {

        Shape shapeCircle = ShapeFactory.getShape("circle");
        shapeCircle.draw();

        Shape rectangleShape = ShapeFactory.getShape("rectangle");
        rectangleShape.draw();

        Shape squareShape = ShapeFactory.getShape("square");
        squareShape.draw();

    }
}
