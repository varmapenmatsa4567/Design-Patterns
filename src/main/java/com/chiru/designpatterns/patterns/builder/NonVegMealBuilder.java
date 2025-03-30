package com.chiru.designpatterns.patterns.builder;

public class NonVegMealBuilder extends MealBuilder {

    private Meal meal;

    public NonVegMealBuilder(){
        this.meal = new Meal();
    }

    @Override
    public void addBiryani() {
        this.meal.setBiryani("Chicken");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Chicken");
    }

    @Override
    public void addCoolDrink() {
       this.meal.setCoolDrink("ThumbsUp");
    }

    @Override
    public Meal build(){
        return this.meal;
    }
    
}
