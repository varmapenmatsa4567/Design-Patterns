package com.chiru.designpatterns.liskov.bad;

public class Square extends Shape {

    @Override
    public void setSide1(int units) {
        super.side1 = units;
        super.side2 = units;
    }

    @Override
    public void setSide2(int units) {
        super.side1 = units;
        super.side2 = units;
    }
    
}
