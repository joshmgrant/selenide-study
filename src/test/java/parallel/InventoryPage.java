package parallel;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InventoryPage {

    private SelenideElement addItemButton = $(".btn_primary");
    private SelenideElement removeItemButton = $(".btn_secondary");
    private SelenideElement shoppingCartBadge = $(".shopping_cart_badge");
    private SelenideElement menu = $(".bm-burger-button");
    private SelenideElement logout = $(By.id("logout_sidebar_link"));

    public void visit(){
        open("https://www.saucedemo.com/inventory.html");
    }

    public void addItems(int items) {
        for (int i = 0; i < items; i++){
            addItemButton.click();
        }
    }

    public void remoteItems(int items) {
        for (int i = 0; i < items; i++) {
            removeItemButton.click();
        }
    }

    public String getNumberOfItemsInCart() {
        try {
            return shoppingCartBadge.getText();
        } catch (ElementNotFound e){
            return "0";
        }
    }


}
