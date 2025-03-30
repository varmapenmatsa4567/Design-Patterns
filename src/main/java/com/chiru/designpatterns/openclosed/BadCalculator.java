package com.chiru.designpatterns.openclosed;

public class BadCalculator {
    public int calculate(int number1, int number2, String type){
        int res = 0;
        switch (type) {
            case "sum":
                res = number1 + number2;
                break;
            case "sub":
                res = number1 - number2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}
