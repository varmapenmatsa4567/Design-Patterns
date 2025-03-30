package com.chiru.designpatterns.patterns.abstract_factory.Windows;

import com.chiru.designpatterns.patterns.abstract_factory.components.Button;

public class WinButton implements Button {
    public void render(){
        System.out.println("Windows Button");
    }
}
