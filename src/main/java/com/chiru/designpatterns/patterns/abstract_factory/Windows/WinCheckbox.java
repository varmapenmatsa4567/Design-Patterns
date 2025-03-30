package com.chiru.designpatterns.patterns.abstract_factory.Windows;

import com.chiru.designpatterns.patterns.abstract_factory.components.Checkbox;

public class WinCheckbox implements Checkbox {
    public void render(){
        System.out.println("Windows checkbox");
    }
}
