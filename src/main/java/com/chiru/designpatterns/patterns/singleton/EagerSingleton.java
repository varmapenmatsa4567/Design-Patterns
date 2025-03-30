package com.chiru.designpatterns.patterns.singleton;

// It works with Multi Threading, but memory will be wasted if object is not used.
public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {};

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
