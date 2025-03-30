package com.chiru.designpatterns.patterns.abstract_factory.UiFactory;

import com.chiru.designpatterns.patterns.abstract_factory.Linux.LinButton;
import com.chiru.designpatterns.patterns.abstract_factory.Linux.LinCheckbox;
import com.chiru.designpatterns.patterns.abstract_factory.components.Button;
import com.chiru.designpatterns.patterns.abstract_factory.components.Checkbox;

public class LinFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new LinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinCheckbox();
    }
    
}
