package com.learning.Strategy;

public class UsaTax implements CalcTax{
    @Override
    public void taxAmount() {
        System.out.println("Tax at US");
    }
}
