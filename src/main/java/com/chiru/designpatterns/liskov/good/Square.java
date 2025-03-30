package com.chiru.designpatterns.liskov.good;

public class Square implements Shape {

    int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }
    
}
