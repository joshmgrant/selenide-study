package parallel;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.openqa.selenium.Platform;

import static com.codeborne.selenide.Selenide.*;


public class TestBase {

    @Before
    public void setUp(){

        String username = System.getenv("SAUCE_USERNAME");
        String accessKey = System.getenv("SAUCE_ACCESS_KEY");

        Configuration.baseUrl ="https://www.saucedemo.com";
        Configuration.remote ="https://"+ username +":"+ accessKey +"@ondemand.saucelabs.com/wd/hub/";
        Configuration.browserCapabilities.setPlatform(Platform.WIN10);
        Configuration.browserCapabilities.setBrowserName("Chrome");
        Configuration.browserCapabilities.setVersion("latest");
        Configuration.browserCapabilities.setCapability("name","Sauce Labs Selenide");

        open("");
    }
}
