package com.learning.Facade;

public class ShapeFacade {

    public void drawShapes(){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
