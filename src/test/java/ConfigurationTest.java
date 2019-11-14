import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.Platform;

import static com.codeborne.selenide.Selenide.open;

public class ConfigurationTest {

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            Selenide.executeJavaScript("sauce:job-result=failed");
        }

        @Override
        protected void succeeded(Description description) {
            Selenide.executeJavaScript("sauce:job-result=passed");
        }
    };

    @Test
    public void firefoxCase(){
        Configuration.baseUrl = "https://www.saucedemo.com";
        Configuration.browser = "firefox";

        open("");
    }

    @Test
    public void sauceLabsCase(){
        String username = System.getenv("SAUCE_USERNAME");
        String accessKey = System.getenv("SAUCE_ACCESS_KEY");

        Configuration.baseUrl = "https://www.saucedemo.com";
        Configuration.remote = "https://" + username + ":" + accessKey + "@ondemand.saucelabs.com/wd/hub/";
        Configuration.browserCapabilities.setPlatform(Platform.WIN10);
        Configuration.browserCapabilities.setBrowserName("Chrome");
        Configuration.browserCapabilities.setVersion("latest");
        Configuration.browserCapabilities.setCapability("name", "Sauce Labs Selenide");

        open("");
    }
}
