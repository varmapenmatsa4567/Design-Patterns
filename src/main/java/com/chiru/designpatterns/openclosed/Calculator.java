package com.chiru.designpatterns.openclosed;

public class Calculator {
    public int calculate(int number1, int number2, Operation operation){
        return operation.operate(number1, number2);
    }
}
