package com.chiru.designpatterns.patterns.factory;

public class LinuxOS extends OperatingSystem {

    public LinuxOS(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Linux - Changing Directory");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Linux - Removing Directory");
    }
    
}
