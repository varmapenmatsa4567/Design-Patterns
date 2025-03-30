package com.chiru.designpatterns.patterns.factory;

public class Main {
    public static void main(String[] args) {
        OperatingSystem os = OSFactory.getInstance("windows", "1.2", "normal");
        os.changeDir("hello");
    }
}
