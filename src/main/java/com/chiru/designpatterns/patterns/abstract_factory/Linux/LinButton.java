package com.chiru.designpatterns.patterns.abstract_factory.Linux;

import com.chiru.designpatterns.patterns.abstract_factory.components.Button;

public class LinButton implements Button {
    public void render(){
        System.out.println("Linux Button");
    }
}
