package com.chiru.designpatterns.patterns.abstract_factory.UiFactory;

import com.chiru.designpatterns.patterns.abstract_factory.components.Button;
import com.chiru.designpatterns.patterns.abstract_factory.components.Checkbox;

public interface UIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
