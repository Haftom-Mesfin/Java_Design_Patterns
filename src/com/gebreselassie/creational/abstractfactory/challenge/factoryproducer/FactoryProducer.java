package com.gebreselassie.creational.abstractfactory.challenge.factoryproducer;

import com.gebreselassie.creational.abstractfactory.challenge.factories.ActionMovieFactory;
import com.gebreselassie.creational.abstractfactory.challenge.factories.ComedyMovieFactory;
import com.gebreselassie.creational.abstractfactory.challenge.factories.MovieFactoryInterface;

public class FactoryProducer {
    public static MovieFactoryInterface getFactory(String movieChoice){
        if(movieChoice.equalsIgnoreCase("comedy")){
            return new ComedyMovieFactory();
        }else if(movieChoice.equalsIgnoreCase("action")){
            return new ActionMovieFactory();
        }
        return null;
    }
}
