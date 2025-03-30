package com.chiru.designpatterns.patterns.abstract_factory.UiFactory;

import com.chiru.designpatterns.patterns.abstract_factory.Windows.WinButton;
import com.chiru.designpatterns.patterns.abstract_factory.Windows.WinCheckbox;
import com.chiru.designpatterns.patterns.abstract_factory.components.Button;
import com.chiru.designpatterns.patterns.abstract_factory.components.Checkbox;

public class WinFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
    
}
