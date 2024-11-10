package org.example.selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.selenide.entity.User;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage extends BasePage {
    protected SelenideElement firstName = $(By.id("firstName"));
    protected SelenideElement lastName = $(By.id("lastName"));
    protected SelenideElement userEmail = $(By.id("userEmail"));
    protected SelenideElement male = $(By.id("gender-radio-1"));
    protected SelenideElement female = $(By.id("gender-radio-2"));
    protected SelenideElement other = $(By.id("gender-radio-3"));
    protected SelenideElement mobileNumber = $(By.id("userNumber"));
    protected SelenideElement dateOfBirth = $(By.id("dateOfBirthInput"));
    protected SelenideElement subjects = $(By.id("subjectsContainer"));
    protected SelenideElement sport = $(By.id("hobbies-checkbox-1"));
    protected SelenideElement reading = $(By.id("hobbies-checkbox-2"));
    protected SelenideElement music = $(By.id("hobbies-checkbox-3"));
    protected SelenideElement uploadPicture = $(By.id("uploadPicture"));
    protected SelenideElement currentAddress = $(By.id("currentAddress"));
    protected SelenideElement submit = $(By.id("submit"));

    public PracticeFormPage fillForm(User user) {

        elementActions.sendKeys(firstName, user.getFirstName())
                .sendKeys(lastName, user.getLastName())
                .sendKeys(userEmail, user.getUserEmail())
                .sendKeys(mobileNumber, user.getMobileNumber())
                .sendKeys(dateOfBirth, user.getDataOfBirth())
                .sendKeys(uploadPicture, user.getUploadPicture())
                .sendKeys(currentAddress, user.getCurrentAddress());

        if (user.getGender().equals("male")) {
            elementActions.click(male);
        } else if (user.getGender().equals("female")) {
            elementActions.click(female);
        } else if (user.getGender().equals("other")) {
            elementActions.click(other);
        }

        elementActions.click(submit);
        return this;
    }

}
