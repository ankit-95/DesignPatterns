package com.learning.Bridge;

public abstract class Shape {
    protected Drawning drawing;

    public Shape(Drawning drawning) {
        this.drawing = drawning;
    }

    abstract void display();
}
