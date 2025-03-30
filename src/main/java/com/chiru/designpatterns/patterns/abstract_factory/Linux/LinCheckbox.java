package com.chiru.designpatterns.patterns.abstract_factory.Linux;

import com.chiru.designpatterns.patterns.abstract_factory.components.Checkbox;

public class LinCheckbox implements Checkbox {
    public void render(){
        System.out.println("Linux Checkbox");
    }
}
