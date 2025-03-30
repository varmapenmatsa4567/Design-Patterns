package com.chiru.designpatterns.patterns.factory;

public class WindowsOS extends OperatingSystem {

    public WindowsOS(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Windows - Changing Directory");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Windows - Removing Directory");
    }
    
}
