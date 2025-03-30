package com.chiru.designpatterns.dependency_inversion.bad;

public class Calculator {
    public int calculate(int n1, int n2, String op){
        int res;
        switch (op) {
            case "add":
                AddOperation add = new AddOperation();
                res = add.operate(n1, n2);
                break;
            case "sub":
                SubOperation sub = new SubOperation();
                res = sub.operate(n1, n2);
            default:
                res = 0;
                break;
        }
        return res;
    }
}
