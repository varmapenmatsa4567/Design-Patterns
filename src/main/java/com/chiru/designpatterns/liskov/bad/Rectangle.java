package com.chiru.designpatterns.liskov.bad;

public class Rectangle extends Shape{

    @Override
    public void setSide1(int units) {
        super.side1 = units;
    }

    @Override
    public void setSide2(int units) {
        super.side2 = units;
    }
    
}
