package com.chiru.designpatterns.patterns.builder;

public abstract class MealBuilder {
    public abstract void addBiryani();
    public abstract void addCurry();
    public abstract void addCoolDrink();
    public abstract Meal build();
}
