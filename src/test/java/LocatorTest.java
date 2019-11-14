import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LocatorTest {
    private SelenideElement userInput = $(By.id("user-name"));
    private SelenideElement passwordInput = $(By.id("password"));
    private SelenideElement submit = $(".btn_action");
    private SelenideElement notOnLoginPage = $(".btn-primary");

    @Before
    public void setUp(){
        open("https://www.saucedemo.com");
    }

    @Test
    public void openBrowser(){
        userInput.sendKeys("bad");
        passwordInput.sendKeys("bad");
        submit.click();

        Assert.assertTrue($(By.cssSelector(".error-button")).isDisplayed());
    }

    @Test
    public void elementNotPresentInDom(){
        Assert.assertFalse(notOnLoginPage.isDisplayed());
    }
}
