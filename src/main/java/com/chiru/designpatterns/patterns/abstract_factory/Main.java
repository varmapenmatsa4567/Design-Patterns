package com.chiru.designpatterns.patterns.abstract_factory;

import com.chiru.designpatterns.patterns.abstract_factory.UiFactory.LinFactory;
import com.chiru.designpatterns.patterns.abstract_factory.UiFactory.WinFactory;

public class Main {
    public static void main(String[] args) {
        Application app = new Application(new LinFactory());
        app.render();
    }
}
