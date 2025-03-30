package com.chiru.designpatterns.liskov.bad;

public class Area {
    public int calculate(int side1, int side2, Shape shape){
        shape.setSide1(side1);
        shape.setSide2(side2);
        return shape.side1 * shape.side2;
    }
}
