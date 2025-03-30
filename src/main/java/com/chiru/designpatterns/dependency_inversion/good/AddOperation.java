package com.chiru.designpatterns.dependency_inversion.good;

public class AddOperation implements Operation {

    @Override
    public int operate(int number1, int number2) {
        return number1 + number2;
    }
    
}
