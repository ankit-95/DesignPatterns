package com.learning.Facade.Shapes;

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
