package org.example.selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MenuPage extends BasePage {

//    @FindBy(xpath = "")
//    WebElement element;

//    ElementsCollection elementCollection = $$("");

    protected SelenideElement leftPanel = $(By.xpath("//div[@class='left-pannel']"));
    private String xPathFormat = "//*[text()='%s']//ancestor::div[@class='header-wrapper']";
    private String xPathFormatSubMenu = "//*[text()='Practice Form']//ancestor::li[@class='btn btn-light ']";

//    SelenideElement elementsMenu = leftPanel.$(By.xpath(String.format(xPathFormat, "Elements")));
//    SelenideElement elementForms = leftPanel.$(By.xpath(String.format(xPathFormat, "Forms")));

    private MenuPage clickByMenuName(String menuName) {
        leftPanel.$(By.xpath(String.format(xPathFormat, menuName))).shouldBe(visible).click();
    return this;
    }
    private MenuPage clickSubMenuName(String menuName){
        leftPanel.$(By.xpath(String.format(xPathFormatSubMenu, menuName))).shouldBe(visible).click();
        return this;
    }

    public MenuPage openSubMenuName(String menuName, String subMenuName){
        clickByMenuName(menuName)
                .clickSubMenuName(subMenuName);
        return this;
    }

}
