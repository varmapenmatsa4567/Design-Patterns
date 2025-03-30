package com.chiru.designpatterns.patterns.builder;

public class Burger {
    private String size;
    private boolean egg;
    private boolean mayonese;
    private boolean onion;

    private Burger(BurgerBuilder burgerBuilder){

    }

    public String getSize() {
        return size;
    }
    public boolean isEgg() {
        return egg;
    }
    public boolean isMayonese() {
        return mayonese;
    }
    public boolean isOnion() {
        return onion;
    }

    public static class BurgerBuilder{
        private String size;
        private boolean egg;
        private boolean mayonese;
        private boolean onion;

        public BurgerBuilder size(String size){
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg){
            this.egg = egg;
            return this;
        }

        public BurgerBuilder mayonese(boolean mayonese){
            this.mayonese = mayonese;
            return this;
        }

        public BurgerBuilder onion(boolean onion){
            this.onion = onion;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
    
}
