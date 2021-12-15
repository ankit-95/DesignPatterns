package com.learning.Strategy;

public class Main {
    public static void main(String[] args) {
        SalesOrder salesOrder = new SalesOrder(new CanadaTax());
        salesOrder.calcTax();
    }

}
