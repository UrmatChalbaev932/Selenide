package org.example.selenide.helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class ElementActions {

    public ElementActions click(SelenideElement element){
        element.should(visible).click();
        return this;
    }
    public ElementActions hover(SelenideElement element){
        element.should(visible).hover();
        return this;
    }
    public ElementActions sendKeys(SelenideElement element, String text){
        element.should(visible).sendKeys(text);
        return this;
    }
    public String getText(SelenideElement element){
        return element.getText();
    }
    public String getValue (SelenideElement element){
        return element.should(visible).getValue();
    }
    public String getDomAttr(SelenideElement element, String attrName){
        return element.should(visible).getAttribute(attrName);
    }
}
