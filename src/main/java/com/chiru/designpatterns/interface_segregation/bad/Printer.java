package com.chiru.designpatterns.interface_segregation.bad;

public class Printer implements Machine {

    @Override
    public void print() {
        System.out.println("Printing....");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Cannot Scan...");
    }
    
}
