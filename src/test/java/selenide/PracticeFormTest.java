package selenide;

import org.example.selenide.entity.User;
import org.example.selenide.enums.Gender;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    @Test
    public void practiceFormTest() {
        User user = User.builder()
                .firstName("John")
                .lastName("Doe")
                .userEmail("asdf.@gmail.com")
                .gender("male")
                .mobileNumber("123412341234")
                .dataOfBirth("33 Apr 2020")
                .currentAddress("Some address 123")
                .build();

        menuPage.openSubMenuName("Forms", "Practice form");
        practiceFormPage.fillForm(user);
    }
}
