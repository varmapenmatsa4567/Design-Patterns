package com.chiru.designpatterns.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // serializationBreak();
        reflectionBreak();
    }

    public static void serializationBreak() throws FileNotFoundException, IOException, ClassNotFoundException{
        SeriazableSingleton basicSingleton = SeriazableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(basicSingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        SeriazableSingleton deserializedObj = (SeriazableSingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(basicSingleton.hashCode());
        System.out.println(deserializedObj.hashCode());
    }

    public static void reflectionBreak() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        BasicSingleton basicSingleton = BasicSingleton.getInstance();

        Constructor<BasicSingleton> constructor = BasicSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BasicSingleton instance2 = constructor.newInstance();
        System.out.println(basicSingleton.hashCode());
        System.out.println(instance2.hashCode());
    }

    /* Clone break can happen if Singleton class is Cloneable
     * In that case, need to override clone method and throw some exception.
    */
    public static void cloneBreak(){
        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        // BasicSingleton clone = (BasicSingleton) basicSingleton.clone();
    }
}