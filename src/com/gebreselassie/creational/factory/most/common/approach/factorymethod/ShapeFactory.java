package com.gebreselassie.creational.factory.most.common.approach.factorymethod;

import com.gebreselassie.creational.factory.most.common.approach.interfaceanditsimplementation.Circle;
import com.gebreselassie.creational.factory.most.common.approach.interfaceanditsimplementation.Rectangle;
import com.gebreselassie.creational.factory.most.common.approach.interfaceanditsimplementation.Shape;
import com.gebreselassie.creational.factory.most.common.approach.interfaceanditsimplementation.Square;

public class ShapeFactory {

    // the getShape is a factory method which is used to get an object of a type Shape

    public Shape getShape(String shapeType){
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
