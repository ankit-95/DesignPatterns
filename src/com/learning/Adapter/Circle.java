package com.learning.Adapter;

public class Circle implements Shape {
    ImpCircle circle;

    Circle(){
        circle = new ImpCircle();
    }

    @Override
    public void display() {
        circle.displayCircle();
    }
}
