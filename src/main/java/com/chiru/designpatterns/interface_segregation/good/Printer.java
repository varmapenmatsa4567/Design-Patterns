package com.chiru.designpatterns.interface_segregation.good;

public class Printer implements PrintingMachine {

    @Override
    public void print() {
        System.out.println("Printing...");
    }
    
}
