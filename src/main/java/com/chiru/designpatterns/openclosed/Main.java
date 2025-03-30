package com.chiru.designpatterns.openclosed;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int val = calc.calculate(12, 23, new AddOperation());
        System.out.println(val);
    }
}
