package com.chiru.designpatterns.patterns.builder;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal(){
        mealBuilder.addBiryani();
        mealBuilder.addCurry();
        mealBuilder.addCoolDrink();
        return mealBuilder.build();
    }

    public static void main(String[] args) {
        Meal meal = new MealDirector(new NonVegMealBuilder()).prepareMeal();
        System.out.println(meal.getBiryani());
    }
}
