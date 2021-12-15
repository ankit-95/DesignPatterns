package com.learning.Facade.Shapes;

public class ShapeFacade {

    public void drawShapes(){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
