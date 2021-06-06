package com.gebreselassie.creational.abstractfactory.productfamilies.factoroffactories;

import com.gebreselassie.creational.abstractfactory.productfamilies.colorfamily.Color;
import com.gebreselassie.creational.abstractfactory.productfamilies.shapefamiliy.Circle;
import com.gebreselassie.creational.abstractfactory.productfamilies.shapefamiliy.Rectangle;
import com.gebreselassie.creational.abstractfactory.productfamilies.shapefamiliy.Shape;
import com.gebreselassie.creational.abstractfactory.productfamilies.shapefamiliy.Square;


public class ShapeFactory extends AbstractFactory{
    @Override
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

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
