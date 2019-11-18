package parallel;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InventoryPage {

    private SelenideElement addItemButton = $(".btn_primary");
    private SelenideElement removeItemButton = $(".btn_secondary");
    private SelenideElement menu = $(".bm-burger-button");
    private SelenideElement logout = $(By.id("logout_sidebar_link"));

    public void visit(){
        open("https://www.saucedemo.com/inventory.html");
    }
}
