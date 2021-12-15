package com.learning.Strategy;

public class CanadaTax implements CalcTax{
    @Override
    public void taxAmount() {
        System.out.println("Tax at Canada");
    }
}
