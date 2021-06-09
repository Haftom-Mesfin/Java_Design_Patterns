package com.gebreselassie.creational.abstractfactory.challenge.client;

import com.gebreselassie.creational.abstractfactory.challenge.factories.MovieFactoryInterface;
import com.gebreselassie.creational.abstractfactory.challenge.factoryproducer.FactoryProducer;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familyone.HollyWoodMovieInterface;
import com.gebreselassie.creational.abstractfactory.challenge.productfamilies.familytwo.BollyWoodMovieInterface;

public class Client {
    public static void main(String[] args) {
        // display action movies
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory("action");
        HollyWoodMovieInterface hollyWoodActionMovie = actionMovies.getHollyWoodMovie();
        BollyWoodMovieInterface bollyWoodActionMovie = actionMovies.getBollyWoodMovie();
        System.out.println(hollyWoodActionMovie.getMovieName());
        System.out.println(bollyWoodActionMovie.getMovieName());

        // dispaly comedy movies
        MovieFactoryInterface comedyMovies = FactoryProducer.getFactory("comedy");
        HollyWoodMovieInterface hollyWoodComedyMovie = comedyMovies.getHollyWoodMovie();
        BollyWoodMovieInterface bollyWoodComedyMovie = comedyMovies.getBollyWoodMovie();
        System.out.println(hollyWoodComedyMovie.getMovieName());
        System.out.println(bollyWoodComedyMovie.getMovieName());
    }
}
