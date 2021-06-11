package com.gebreselassie.behavioural.template;

public class WoodenHouse extends HouseTemplate{
    @Override
    public void buildPillars() {
        System.out.println("Building pillar with wooden coating.");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls.");
    }
}
