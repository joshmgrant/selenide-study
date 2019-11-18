package parallel;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private SelenideElement userInput = $(By.id("user-name"));
    private SelenideElement passwordInput = $(By.id("password"));
    private SelenideElement submit = $(".btn_action");
    private SelenideElement errorMessage = $(".error-button");

    public void visit(){
        open("https://www.saucedemo.com");
    }

    public void loginAs(String username, String password){
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();
    }

    public boolean errorMessageDisplayed(){
        return errorMessage.isDisplayed();
    }

}
