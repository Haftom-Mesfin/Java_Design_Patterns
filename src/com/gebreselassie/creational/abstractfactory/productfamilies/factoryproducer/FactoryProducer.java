package com.gebreselassie.creational.abstractfactory.productfamilies.factoryproducer;

import com.gebreselassie.creational.abstractfactory.productfamilies.factoryoffactories.AbstractFactory;
import com.gebreselassie.creational.abstractfactory.productfamilies.factoryoffactories.ColorFactory;
import com.gebreselassie.creational.abstractfactory.productfamilies.factoryoffactories.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String chooseFactory){
        if(chooseFactory.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(chooseFactory.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
