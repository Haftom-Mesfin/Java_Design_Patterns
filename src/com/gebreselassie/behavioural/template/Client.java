package com.gebreselassie.behavioural.template;

public class Client {
    public static void main(String[] args) {
        HouseTemplate houseTemplate = new WoodenHouse();
        //using template method
        houseTemplate.buildHouse();
        System.out.println("******************************");
        houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();
    }
}
