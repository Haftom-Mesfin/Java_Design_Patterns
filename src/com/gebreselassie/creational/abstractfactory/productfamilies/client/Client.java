package com.gebreselassie.creational.abstractfactory.productfamilies.client;

import com.gebreselassie.creational.abstractfactory.productfamilies.colorfamily.Color;
import com.gebreselassie.creational.abstractfactory.productfamilies.factoryoffactories.AbstractFactory;
import com.gebreselassie.creational.abstractfactory.productfamilies.factoryproducer.FactoryProducer;
import com.gebreselassie.creational.abstractfactory.productfamilies.shapefamiliy.Shape;

public class Client {
    //has a relationship with FactoryProducer
    public static void main(String[] args) {
        //get factory object
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        // get shape object
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        // get factory object
        AbstractFactory colorFactroy = FactoryProducer.getFactory("COLOR");
        //get color object
        Color color = colorFactroy.getColor("RED");
        color.fill();

    }
}
