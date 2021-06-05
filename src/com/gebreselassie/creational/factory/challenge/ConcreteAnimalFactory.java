package com.gebreselassie.creational.factory.challenge;

public class ConcreteAnimalFactory extends AnimalAbstractFactory{
    // factory method
    public Animal getAnimalFood(String animalFood) throws Exception{
        if(animalFood == null)
            return null;
        switch(animalFood){
            case"DUCK":
                return new Duck();
            case "TIGER":
                return new Tiger();
            default:
                new Exception("Animal type " + animalFood + " can't be instantiated");
                break;
        }
        return null;
    }
}
