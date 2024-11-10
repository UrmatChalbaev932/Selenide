package selenide;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.SoftAsserts;
import org.example.selenide.pages.MenuPage;
import org.example.selenide.pages.PracticeFormPage;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(SoftAsserts.class)
public class BaseTest {

    MenuPage menuPage = new MenuPage();
    PracticeFormPage practiceFormPage = new PracticeFormPage();


    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(){
        //settings
    }
    @BeforeMethod
    public void openDemoQa(){
        Selenide.open("https://demoqa.com/");
    }
}
