package com.learning.Bridge;

public class Rectangle extends Shape {

    Rectangle(Drawning drawning){
        super(drawning);
    }
    @Override
    public void display() {
        drawing.drawline();
    }
}
