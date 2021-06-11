package com.gebreselassie.behavioural.template;

public abstract class HouseTemplate {
    // template method, which is final so that it can't be overridden by subclasses
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built!");
    }

    // default implementation, hook method
    private void buildWindows(){
        System.out.println("Building glass window.");
    }

    // methods to be implemented by subclasses
    public abstract void buildPillars();
    public abstract void buildWalls();

    // foundation is same for all
    public void buildFoundation(){
        System.out.println("Build the foundation with cement, iron rods and sand.");
    }
}
