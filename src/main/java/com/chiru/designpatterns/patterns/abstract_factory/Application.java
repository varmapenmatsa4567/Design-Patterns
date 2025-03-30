package com.chiru.designpatterns.patterns.abstract_factory;

import com.chiru.designpatterns.patterns.abstract_factory.UiFactory.UIFactory;
import com.chiru.designpatterns.patterns.abstract_factory.components.Button;
import com.chiru.designpatterns.patterns.abstract_factory.components.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory uiFactory){
        this.button = uiFactory.createButton();
        this.checkbox = uiFactory.createCheckbox();
    }

    public void render(){
        button.render();
        checkbox.render();
    }
}
