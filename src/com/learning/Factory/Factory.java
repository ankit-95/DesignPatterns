package com.learning.Factory;

public class Factory {

    public Book bookFactory(String source){
        if(source.equals("Maths"))
            return new Maths();
        else if(source.equals("English"))
            return new English();
        else
            return null;
    }

}
