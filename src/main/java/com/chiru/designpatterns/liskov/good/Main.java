package com.chiru.designpatterns.liskov.good;

public class Main {
    public static void main(String[] args) {
        Shape rec = new Rectangle(10, 20);
        System.out.println(rec.getArea());
        Shape sq = new Square(20);
        System.out.println(sq.getArea());
    }
}
