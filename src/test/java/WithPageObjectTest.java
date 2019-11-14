import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WithPageObjectTest {

    private LoginPage loginPage;

    @Before
    public void setUp(){
        loginPage = new LoginPage();
    }

    @Test
    public void validLogin(){
        loginPage.visit();
        loginPage.loginAs("standard_user", "secret_sauce");
    }

    @Test
    public void invalidLogin(){
        loginPage.visit();
        loginPage.loginAs("bad", "bad");

        Assert.assertTrue(loginPage.errorMessageDisplayed());
    }
}
