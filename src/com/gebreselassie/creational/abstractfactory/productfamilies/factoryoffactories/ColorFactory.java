package com.gebreselassie.creational.abstractfactory.productfamilies.factoryoffactories;

import com.gebreselassie.creational.abstractfactory.productfamilies.colorfamily.Blue;
import com.gebreselassie.creational.abstractfactory.productfamilies.colorfamily.Color;
import com.gebreselassie.creational.abstractfactory.productfamilies.colorfamily.Green;
import com.gebreselassie.creational.abstractfactory.productfamilies.colorfamily.Red;
import com.gebreselassie.creational.abstractfactory.productfamilies.shapefamiliy.Shape;

public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String colorType) {
        if(colorType == null)
            return null;
        else if(colorType.equalsIgnoreCase("RED"))
            return new Red();
        else if(colorType.equalsIgnoreCase("GREEN"))
            return new Green();
        else if(colorType.equalsIgnoreCase("BLUE"))
            return new Blue();
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
