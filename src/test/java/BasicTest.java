import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class BasicTest {

    @Before
    public void setUp(){
        open("https://www.saucedemo.com");
    }

    @Test
    public void openBrowser(){
        $(By.id("user-name")).sendKeys("");
        $(By.id("password")).sendKeys("bad");
        $(By.cssSelector(".btn_action")).click();

        Assert.assertTrue($(By.cssSelector(".error-button")).isDisplayed());
    }
}
