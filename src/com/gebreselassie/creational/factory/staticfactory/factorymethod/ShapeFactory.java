package com.gebreselassie.creational.factory.staticfactory.factorymethod;

import com.gebreselassie.creational.factory.staticfactory.interfaceanditsimplementations.Circle;
import com.gebreselassie.creational.factory.staticfactory.interfaceanditsimplementations.Rectangle;
import com.gebreselassie.creational.factory.staticfactory.interfaceanditsimplementations.Shape;
import com.gebreselassie.creational.factory.staticfactory.interfaceanditsimplementations.Square;

public class ShapeFactory {
    // the getShape is a factory method which is used to get an object of a type Shape

    public static Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        else if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;

    }
}
