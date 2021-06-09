package com.gebreselassie.creational.abstractfactory.challenge.factories;

import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familyone.HollyWoodMovieInterface;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familytwo.BollyWoodMovieInterface;

public interface MovieFactoryInterface {
    HollyWoodMovieInterface getHollyWoodMovie();
    BollyWoodMovieInterface getBollyWoodMovie();
}
