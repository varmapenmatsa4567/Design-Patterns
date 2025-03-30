package com.chiru.designpatterns.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                            .egg(true)
                            .size("LARGE")
                            .build();
    }
}
