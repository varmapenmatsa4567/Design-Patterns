package com.chiru.designpatterns.patterns.singleton;

import java.io.Serializable;

public class SeriazableSingleton implements Serializable {
    private static SeriazableSingleton basicSingleton = null;

    private SeriazableSingleton(){};

    public static SeriazableSingleton getInstance(){
        if(basicSingleton == null){
            basicSingleton = new SeriazableSingleton();
        }
        return basicSingleton;
    }

    protected Object readResolve() {
        return basicSingleton;
    }
}
