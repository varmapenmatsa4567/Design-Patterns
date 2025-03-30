package com.chiru.designpatterns.dependency_inversion.good;

public class Calculator {
    public int calculate(int number1, int number2, Operation operation){
        return operation.operate(number1, number2);
    }
}
