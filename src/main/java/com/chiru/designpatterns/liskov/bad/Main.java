package com.chiru.designpatterns.liskov.bad;

public class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        Area a = new Area();
        System.out.println(a.calculate(5, 10, new Square()));
        System.out.println(a.calculate(5, 10, new Rectangle()));
    }
}
