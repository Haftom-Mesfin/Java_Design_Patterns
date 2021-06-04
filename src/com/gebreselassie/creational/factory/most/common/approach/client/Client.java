package com.gebreselassie.creational.factory.most.common.approach.client;

import com.gebreselassie.creational.factory.most.common.approach.factorymethod.ShapeFactory;
import com.gebreselassie.creational.factory.most.common.approach.interfaceanditsimplementation.Shape;

public class Client {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        // get a Circle object and draw
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        circleShape.draw();

        Shape rectangleShape = shapeFactory.getShape("rECTANGLE");
        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape("square");
        squareShape.draw();
    }
}
