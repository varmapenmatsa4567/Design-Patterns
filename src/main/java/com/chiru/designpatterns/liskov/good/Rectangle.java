package com.chiru.designpatterns.liskov.good;

public class Rectangle implements Shape {

    int width;
    int height;

    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }
    
}
