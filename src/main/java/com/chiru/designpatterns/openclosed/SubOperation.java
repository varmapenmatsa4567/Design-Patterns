package com.chiru.designpatterns.openclosed;

public class SubOperation implements Operation {

    @Override
    public int operate(int number1, int number2) {
        return number1 - number2;
    }
    
}
