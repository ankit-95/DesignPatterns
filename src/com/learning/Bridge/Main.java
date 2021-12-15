package com.learning.Bridge;

public class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle(new DP2());
        s.display();
    }
}
