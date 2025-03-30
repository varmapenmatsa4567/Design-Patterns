package com.chiru.designpatterns.patterns.builder;

public class VegMealBuilder extends MealBuilder {

    private Meal meal;

    public VegMealBuilder(){
        this.meal = new Meal();
    }

    @Override
    public void addBiryani() {
        this.meal.setBiryani("Veg");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Panner");
    }

    @Override
    public void addCoolDrink() {
        this.meal.setCoolDrink("Sprite");
    }

    @Override
    public Meal build(){
        return this.meal;
    }
    
}
