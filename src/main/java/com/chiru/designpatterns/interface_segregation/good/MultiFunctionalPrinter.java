package com.chiru.designpatterns.interface_segregation.good;

public class MultiFunctionalPrinter implements PrintingMachine, ScanningMachine {

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void print() {
        System.out.println("Printing...");
    }
    
}
