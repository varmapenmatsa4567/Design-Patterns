package com.chiru.designpatterns.patterns.factory;

public class OSFactory {

    private OSFactory(){};
    
    public static OperatingSystem getInstance(String type, String version, String arc){
        switch (type) {
            case "windows":
                return new WindowsOS(version, arc);
            case "linux":
                return new LinuxOS(version, arc);
            default:
                throw new IllegalArgumentException("Specified type is not present.");
        }
    }
}
