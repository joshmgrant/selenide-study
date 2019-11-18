package parallel;

import org.junit.Test;

public class LoginTest {

    private LoginPage loginPage;

    @Test
    public void valid(){
        loginPage = new LoginPage();
        loginPage.visit();

    }

    @Test
    public void invalid(){
        loginPage = new LoginPage();
        loginPage.visit();
    }
}
