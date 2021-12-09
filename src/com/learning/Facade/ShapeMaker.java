package com.learning.Facade;

public class ShapeMaker {

    Rectangle rec;
    Circle c;
    ShapeMaker(){
        rec = new Rectangle();
        c = new Circle();
    }

    public void drawCircle(){
        c.display();
    }

    public void drawRectangle(){
        rec.display();
    }
}
