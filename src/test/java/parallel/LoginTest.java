package parallel;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest {

    private LoginPage loginPage;

    @Test
    public void valid(){
        loginPage = new LoginPage();
        loginPage.visit();

        loginPage.loginAs("standard_user", "secret_sauce");

        // kind of hacky but it does work
        Assert.assertEquals(loginPage.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }

    @Test
    public void invalid(){
        loginPage = new LoginPage();
        loginPage.visit();

        loginPage.loginAs("bad", "name");

        Assert.assertTrue(loginPage.errorMessageDisplayed());
    }
}
