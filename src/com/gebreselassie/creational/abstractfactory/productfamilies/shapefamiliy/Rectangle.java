package com.gebreselassie.creational.abstractfactory.productfamilies.shapefamiliy;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside rectangle draw.");
    }
}
