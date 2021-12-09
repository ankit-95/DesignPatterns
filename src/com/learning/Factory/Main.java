package com.learning.Factory;

public class Main {

    public static void main(String[] args) {
        Factory f = new Factory();
        Book b = f.bookFactory("English");
        System.out.println(b.features());
    }
}
