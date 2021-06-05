package com.gebreselassie.creational.factory.challenge;

public class AnimalClient {
    public static void main(String[] args) throws Exception{
        AnimalAbstractFactory animalFactory = new ConcreteAnimalFactory();
        Animal duckAnimal = animalFactory.getAnimalFood("DUCK");
        duckAnimal.eat();

        Animal tigerAnimal = animalFactory.getAnimalFood("TIGER");
        tigerAnimal.eat();
    }
}
