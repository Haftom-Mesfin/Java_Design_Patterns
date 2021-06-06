package com.gebreselassie.creational.factory.challenge;

public class AnimalClient {
    public static void main(String[] args) throws Exception{

        // get duck objects and what it eats
        AnimalAbstractFactory animalFactory = new ConcreteAnimalFactory();
        Animal duckAnimal = animalFactory.getAnimalFood("DUCK");
        duckAnimal.eat();

        // get tiger object and what it eats
        Animal tigerAnimal = animalFactory.getAnimalFood("TIGER");
        tigerAnimal.eat();
    }
}
