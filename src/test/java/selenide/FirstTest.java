package selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.example.selenide.pages.MenuPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class FirstTest {
    @Test
    public void firstTest(){
       Selenide.open("https:demoqa.com");
       $(By.xpath("//h5[text()='Elements']/parent::div[@class='card-body']/parent::div/parent::div[@class='card mt-4 top-card']"))
               .click();
       $(By.xpath("//div[text()='Please select an item from left to start practice.']"))
               .shouldHave(Condition.text("Please select an item from left to start practice."));

        MenuPage menuPage = new MenuPage();
        menuPage.openSubMenuName("Widgets", "Slider");
    }

}
