package com.gebreselassie.creational.abstractfactory.challenge.factories;

import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familyone.HollyWoodComedyMovie;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familyone.HollyWoodMovieInterface;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familytwo.BollyWoodComedyMovie;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familytwo.BollyWoodMovieInterface;

public class ComedyMovieFactory implements MovieFactoryInterface{
    @Override
    public HollyWoodMovieInterface getHollyWoodMovie() {
        return new HollyWoodComedyMovie();
    }

    @Override
    public BollyWoodMovieInterface getBollyWoodMovie() {
        return new BollyWoodComedyMovie();
    }
}
