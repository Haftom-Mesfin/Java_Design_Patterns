package com.gebreselassie.creational.abstractfactory.productfamilies.factoroffactories;

import com.gebreselassie.creational.abstractfactory.productfamilies.colorfamily.Color;
import com.gebreselassie.creational.abstractfactory.productfamilies.shapefamiliy.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}
