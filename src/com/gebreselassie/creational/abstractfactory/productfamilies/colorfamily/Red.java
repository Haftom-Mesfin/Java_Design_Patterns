package com.gebreselassie.creational.abstractfactory.productfamilies.colorfamily;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside red fill.");
    }
}
