package com.gebreselassie.creational.abstractfactory.challenge.factories;

import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familyone.HollyWoodActionMovie;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familyone.HollyWoodMovieInterface;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familytwo.BollyWoodActionMovie;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familytwo.BollyWoodMovieInterface;

public class ActionMovieFactory implements MovieFactoryInterface{
    @Override
    public HollyWoodMovieInterface getHollyWoodMovie() {
        return new HollyWoodActionMovie();
    }

    @Override
    public BollyWoodMovieInterface getBollyWoodMovie() {
        return new BollyWoodActionMovie();
    }
}
