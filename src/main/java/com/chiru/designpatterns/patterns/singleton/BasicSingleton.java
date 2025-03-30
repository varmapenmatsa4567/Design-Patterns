package com.chiru.designpatterns.patterns.singleton;

// It fails in Multi Threading.
public class BasicSingleton {
    private static BasicSingleton basicSingleton = null;

    private BasicSingleton(){
        if(basicSingleton != null){
            throw new IllegalStateException("Cannot create more than one instance");
        }
    };

    public static BasicSingleton getInstance(){
        if(basicSingleton == null){
            basicSingleton = new BasicSingleton();
        }
        return basicSingleton;
    }
}
