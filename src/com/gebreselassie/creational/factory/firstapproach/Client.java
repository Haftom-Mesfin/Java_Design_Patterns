package com.gebreselassie.creational.factory.firstapproach;

public class Client {
    public static void main(String[] args) {
        //get Circle object and call its draw method.
        Shape circleShape = new CircleFactory().getShape();
        circleShape.draw();

        //get Rectangle object and call its draw method.
        Shape rectangleShape = new RectangleFactory().getShape();
        rectangleShape.draw();

        //get Rectangle object and call its draw method.
        Shape squareShape = new SquareFactory().getShape();
        squareShape.draw();
    }
}
