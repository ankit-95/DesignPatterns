package com.learning.Strategy;

public class SalesOrder {

    CalcTax c;
    SalesOrder(CalcTax c){
        this.c = c;
    }

    public void calcTax(){
        c.taxAmount();
    }
}
